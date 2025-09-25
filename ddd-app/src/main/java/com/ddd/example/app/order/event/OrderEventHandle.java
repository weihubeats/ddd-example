package com.ddd.example.app.order.event;

import com.event.bus.rocketmq.boot.annotation.EventBusConsumer;
import com.event.bus.rocketmq.boot.annotation.EventBusListener;
import com.nebula.base.utils.JsonUtil;
import com.ddd.example.component.constants.MQConstants;
import lombok.extern.slf4j.Slf4j;

/**
 * @author : wh
 * @date : 2022/5/31 10:27
 * @description: 事件定义
 */
// todo , tag = MQConstants.DOMAIN_EVENT_TAG
@EventBusConsumer(topic = MQConstants.DOMAIN_EVENT_TOPIC, groupId = MQConstants.GID_DOMAIN_EVENT)
@Slf4j
public class OrderEventHandle {

    @EventBusListener(tag = OrderMessage.TAG)
    public void test(TestMessage testMessage) {
        String jsonString = JsonUtil.toJSONString(testMessage);
        System.out.println("testMessage = " + jsonString);
    }
}
