package com.example.icecool.service;

import com.example.icecool.model.CondimentType;
import com.example.icecool.model.OrderItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    public Double calculateTotal(List<OrderItem> orderItems) throws IllegalArgumentException {
        var price = 0.0;

        for (OrderItem item : orderItems) {
            price += item.getFlavour().getPrice();

            for (CondimentType condimentType : item.getCondimentTypes()) {

                if (item.getFlavour().getAvailbleCondimentTypes().contains(condimentType)) {
                    price += condimentType.getPrice();
                } else {
                    throw new IllegalArgumentException("Provided un-available condiment types.");
                }
            }

            price += item.getContainer().getPrice();
        }
        return price;
    }

}
