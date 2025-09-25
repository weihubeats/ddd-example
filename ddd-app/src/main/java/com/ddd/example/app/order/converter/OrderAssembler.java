package com.ddd.example.app.order.converter;

import com.ddd.example.app.order.vo.OrderVO;
import com.ddd.example.infr.order.entity.OrderDO;
import com.nebula.base.model.NebulaPageRes;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : wh
 * @date : 2022/5/31 10:24
 * @description: 仅做各种数据转换， vo -> do  do -> vo  不放入spring容器中，仅定义静态方法
 */
public class OrderAssembler {
    
    public static List<OrderVO> toOrderVOs(List<OrderDO> orderDOs) {
        return orderDOs.stream().map(OrderAssembler::toOrderDO).collect(Collectors.toList());
    }

    public static NebulaPageRes<OrderVO> toOrderVOs(NebulaPageRes<OrderDO> orderDOs) {
        List<OrderVO> orderVOS = orderDOs.getList().stream().map(OrderAssembler::toOrderDO).collect(Collectors.toList());
        return NebulaPageRes.of(orderVOS, orderDOs.getTotalCount(), orderDOs.getPageSize());
        
    }

    
    public static OrderVO toOrderDO(OrderDO orderDO) {
        OrderVO orderVO = new OrderVO();
        orderVO.setId(orderDO.getId());
        orderVO.setChannel(orderDO.getChannel());
        orderVO.setPhone(orderDO.getPhone());
        orderVO.setOrderStatus(orderDO.getOrderStatus());
        return orderVO;
    }


}
