package com.ddd.example.infr.order.entity;

import lombok.Data;

/**
 * @author : wh
 * @date : 2022/6/1 14:26
 * @description: 与数据库一一对应
 */
@Data
public class OrderDO {

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
    
    
    
}
