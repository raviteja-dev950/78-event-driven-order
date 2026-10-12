package com.order.kafka;

import com.order.model.Order;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {
    private final KafkaTemplate<String, Order> template;
    
    public OrderProducer(KafkaTemplate<String, Order> t){
        this.template=t;
    }
    
    public void send(Order order){
        try{ 
            template.send("orders", order); 
        }catch(Exception e){}
        System.out.println(">>> PRODUCED Event: "+order);
    }
}