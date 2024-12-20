package com.ddd.example.web.order.v1;

import com.ddd.example.app.order.executor.OrderApplicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wh
 * @date : 2022/5/31 10:07
 * @description:
 */
@Slf4j
@RestController("/order/v1")
@RequiredArgsConstructor
public class OrderController {

    private final OrderApplicationService orderApplicationService;
    
    
}
