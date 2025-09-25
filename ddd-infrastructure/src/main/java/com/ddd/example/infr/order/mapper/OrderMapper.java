package com.ddd.example.infr.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ddd.example.infr.order.entity.OrderDO;
import com.ddd.example.infr.order.queryentity.OrderQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author : wh
 * @date : 2022/6/1 14:28
 * @description:
 */
@Repository
public interface OrderMapper extends BaseMapper<OrderDO> {
    
    List<OrderDO> getOrders(@Param("dto") OrderQuery query);
    
    
    
    
}
