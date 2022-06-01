package config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.codec.JsonJacksonCodec;
import org.redisson.config.Config;
import org.redisson.config.SingleServerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ObjectUtils;

/**
 * @author : wh
 * @date : 2022/6/1 10:28
 * @description:
 */
@Configuration
public class RedissonConfig {

    @Value("${redis.host}")
    private String redisLoginHost;
    @Value("${redis.port}")
    private Integer redisLoginPort;
    @Value("${redis.password}")
    private String redisLoginPassword;
    @Value("${redis.dionysus.database:1}")
    private Integer redisDatabase;


    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        SingleServerConfig singleServerConfig = config.useSingleServer();
        singleServerConfig.setAddress("redis://" + redisLoginHost + ":" + redisLoginPort + "");
        singleServerConfig.setDatabase(redisDatabase);
        if (!ObjectUtils.isEmpty(redisLoginPassword)) {
            singleServerConfig.setPassword(redisLoginPassword);
        }
        config.setCodec(new JsonJacksonCodec());
        return Redisson.create(config);
    }



}

