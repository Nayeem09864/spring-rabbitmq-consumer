package com.example.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.queue)
    public void listener(CustomeMessage message) {
        System.out.println("Message---" + message);
    }
}
