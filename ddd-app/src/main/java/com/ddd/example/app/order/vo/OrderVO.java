package com.ddd.example.app.order.vo;

import lombok.Data;

/**
 * @author : wh
 * @date : 2022/5/31 10:26
 * @description:
 */
@Data
public class OrderVO {

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
