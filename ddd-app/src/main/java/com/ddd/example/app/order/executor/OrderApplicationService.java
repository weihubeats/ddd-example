package com.ddd.example.app.order.executor;

import com.ddd.example.app.order.converter.OrderAssembler;
import com.ddd.example.app.order.vo.OrderVO;
import com.ddd.example.infr.order.entity.OrderDO;
import com.ddd.example.infr.order.queryentity.OrderQuery;
import com.ddd.example.infr.order.querygateway.OrderGateway;
import com.nebula.base.model.NebulaPageRes;
import com.sun.istack.internal.NotNull;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * @author : wh
 * @date : 2022/5/31 10:29
 * @description: 订单业务逻辑处理(类似MVC中的Service)
 */
@Slf4j
@Service
@RequiredArgsConstructor
@Validated
public class OrderApplicationService {

    private final OrderGateway orderGateway;

    public List<OrderVO> getOrderByUid(@NotNull Long uid) {
        List<OrderDO> orderDos = orderGateway.getOrderByUid(uid);
        return OrderAssembler.toOrderVOs(orderDos);
    }

    public NebulaPageRes<OrderVO> getOrders(OrderQuery query) {
        NebulaPageRes<OrderDO> orders = orderGateway.getOrders(query);
        return OrderAssembler.toOrderVOs(orders);
    }
}
