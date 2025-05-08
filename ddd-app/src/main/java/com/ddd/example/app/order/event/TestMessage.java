package com.ddd.example.app.order.event;

import com.event.bus.rocketmq.boot.core.EventBusAbstractMessage;

/**
 * @author : wh
 * @date : 2025/5/7
 * @description:
 */
public class TestMessage extends EventBusAbstractMessage {


    public static final String TAG = "xiaozou-tag";
    
    @Override
    public String getTag() {
        return TAG;
    }
}
