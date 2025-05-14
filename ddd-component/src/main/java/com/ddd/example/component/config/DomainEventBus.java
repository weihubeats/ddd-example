package com.ddd.example.component.config;

import com.ddd.example.component.constants.MQConstants;
import com.event.bus.rocketmq.boot.annotation.EventBusProducer;
import com.event.bus.rocketmq.boot.core.EventBusRocketMQTemplate;

/**
 * @author : wh
 * @date : 2025/5/7
 * @description:
 */
@EventBusProducer(topic = MQConstants.DOMAIN_EVENT_TOPIC)
public class DomainEventBus extends EventBusRocketMQTemplate {
}
