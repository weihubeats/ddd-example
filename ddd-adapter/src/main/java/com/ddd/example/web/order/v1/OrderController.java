package com.ddd.example.web.order.v1;

import com.ddd.example.app.order.executor.OrderApplicationService;
import com.ddd.example.app.order.vo.OrderVO;
import com.ddd.example.infr.order.queryentity.OrderQuery;
import com.nebula.base.model.NebulaPageRes;
import com.nebula.web.boot.annotation.NebulaResponseBody;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wh
 * @date : 2022/5/31 10:07
 * @description:
 */
@Slf4j
@RestController
@RequestMapping("/order/v1")
@RequiredArgsConstructor
public class OrderController {

    private final OrderApplicationService orderApplicationService;
    
    @GetMapping
    @NebulaResponseBody
    public List<OrderVO> getOrderByUid(Long uid) {
        return orderApplicationService.getOrderByUid(uid);
        
    }
    
    // 分页查询
    @GetMapping
    @NebulaResponseBody
    public NebulaPageRes<OrderVO> getOrders(OrderQuery query) {
        return orderApplicationService.getOrders(query);

    }
    
    
    
}
