package com.order.kafka;

import com.order.model.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    
    @KafkaListener(topics="orders", groupId="order-group", autoStartup="false")
    public void consume(Order order){
        System.out.println(">>> CONSUMED Event: "+order);
    }
}