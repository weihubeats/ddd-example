package com.ddd.example.infr.order.querygateway;

import com.ddd.example.infr.order.entity.OrderDO;
import java.util.List;

/**
 * @author : wh
 * @date : 2022/6/1 14:36
 * @description:
 */
public interface OrderGateway {
    
    List<OrderDO> getOrderByUid(Long uid);
}
