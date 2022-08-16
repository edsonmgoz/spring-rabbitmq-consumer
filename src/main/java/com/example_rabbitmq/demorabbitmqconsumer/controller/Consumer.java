package com.example_rabbitmq.demorabbitmqconsumer.controller;

import com.example_rabbitmq.demorabbitmqconsumer.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Consumer {
    @RabbitListener(queues = "queue.A")
    private void receive(Message message) {
        log.info("Message received form QUEUE A->{}", message);
    }

    @RabbitListener(queues = "queue.B")
    private void receiveFromB(Message message) {
        log.info("Message received form QUEUE B->{}", message);
    }
}
