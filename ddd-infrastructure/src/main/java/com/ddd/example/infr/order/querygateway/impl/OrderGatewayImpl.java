package com.ddd.example.infr.order.querygateway.impl;

import com.ddd.example.infr.order.entity.OrderDO;
import com.ddd.example.infr.order.mapper.OrderMapper;
import com.ddd.example.infr.order.queryentity.OrderQuery;
import com.ddd.example.infr.order.querygateway.OrderGateway;
import com.github.pagehelper.Page;
import com.nebula.base.model.NebulaPageRes;
import com.nebula.mybatis.utils.PageHelperUtils;
import java.util.Collections;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * @author : wh
 * @date : 2022/6/1 14:36
 * @description:
 */
@Repository
@RequiredArgsConstructor
public class OrderGatewayImpl implements OrderGateway {
    
    private final OrderMapper orderMapper;
    
    @Override
    public List<OrderDO> getOrderByUid(Long uid) {
        return Collections.emptyList();
    }

    @Override
    public NebulaPageRes<OrderDO> getOrders(OrderQuery query) {
        Page<OrderDO> page = PageHelperUtils.startPage(query);
        
        List<OrderDO> dos = orderMapper.selectList(null);
        return PageHelperUtils.of(dos, page);
    }
}
