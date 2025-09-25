package com.ddd.example.app.order.event;

import com.event.bus.rocketmq.boot.core.EventBusAbstractMessage;

/**
 * @author : wh
 * @date : 2025/5/7
 * @description:
 */
public class OrderMessage extends EventBusAbstractMessage {
    
    public static final String TAG = "order-tag";
    
    @Override
    public String getTag() {
        return TAG;
    }
}
