package com.ddd.example.rpc.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.Retryer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

/**
 * @author : wh
 * @date : 2025/3/15 16:33
 * @description:
 */
public class CrmClientConfiguration implements RequestInterceptor {

    @Value("${feign.period:1000}")
    private long feignPeriod;

    @Value("${feign.maxPeriod:3000}")
    private long feignMaxPeriod;

    @Value("${feign.maxAttempts:3}")
    private int feignMaxAttempts;

    @Override
    public void apply(RequestTemplate template) {
        template.header("xiaozou", "xiaozou");
    }

    @Bean
    public MyErrorDecoder errorDecoder() {
        return new MyErrorDecoder();
    }

    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default(feignPeriod, feignMaxPeriod, feignMaxAttempts);
    }

}
