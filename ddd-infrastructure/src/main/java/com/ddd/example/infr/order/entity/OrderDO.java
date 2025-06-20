package com.ddd.example.infr.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.nebula.mybatis.entity.BaseDO;
import java.util.List;
import lombok.Data;

/**
 * @author : wh
 * @date : 2022/6/1 14:26
 * @description: 与数据库一一对应
 */
@Data
@TableName("order")
public class OrderDO extends BaseDO {

    /**
     * 订单号
     */
    private Long id;

    /**
     * 渠道号
     */
    private String channel;

    /**
     * 电话
     */
    private String phone;

    /**
     * 订单状态: 已下单,待审核(已付款),已审核,已取消,已关闭
     */
    private Integer orderStatus;

    /**
     * 订单tag
     */
    private List<String> tags;
    
    private List<String> platforms;
    
    
    
}
