package com.foodKart.Services;

import com.foodKart.Entities.Order;
import com.foodKart.Repository.OrderRepository;

import java.util.List;

public class OrderHistoryService {
    public void getOrderHistory(String phoneNumber){
        List<Order> orders = OrderRepository.orderMap.get(phoneNumber);
    }
}
