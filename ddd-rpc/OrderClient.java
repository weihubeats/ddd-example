/**
 * @author : wh
 * @date : 2025/3/15 16:32
 * @description:
 */
@FeignClient(name = "${feign.client.service.artemis}", url = "${feign.client.artemis.url}", configuration = ArtemisClientConfiguration.class)
public interface OrderClient {
}
