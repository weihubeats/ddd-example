package com.ddd.example.rpc.client;

import com.ddd.example.rpc.config.CrmClientConfiguration;
import com.ddd.example.rpc.dto.CrmDTO;
import com.nebula.web.boot.api.NebulaResponse;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : wh
 * @date : 2025/3/15 16:33
 * @description:
 */
@FeignClient(name = "${feign.client.service.crm}", url = "${feign.client.crm.url}", configuration = CrmClientConfiguration.class)
public interface CrmClient {

    @GetMapping("/v1/get")
    NebulaResponse<List<CrmDTO>> getMessage(@RequestParam("uid") Long uid);

    @PostMapping("/v1/send")
    NebulaResponse<String> sendMessage(@RequestBody CrmDTO dto);

}
