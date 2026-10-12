package com.order.controller;

import com.order.kafka.OrderProducer;
import com.order.model.Order;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderProducer producer;
    
    public OrderController(OrderProducer p){
        this.producer=p;
    }
    
    @PostMapping
    public String place(@RequestBody Order o){ 
        producer.send(o); 
        return "Order placed: "+o; 
    }
    
    @GetMapping
    public String health(){ 
        return "78-event-driven-order RUNNING on 8087"; 
    }
}