package com.example.icecool.controller;

import com.example.icecool.model.OrderItem;
import com.example.icecool.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("calculate-price")
    public String calculatePrice(@RequestBody List<OrderItem> orderItems) {

        try {
            var price = this.orderService.calculateTotal(orderItems);
            return "Your total price: " + price + " LKR";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }

    }

}
