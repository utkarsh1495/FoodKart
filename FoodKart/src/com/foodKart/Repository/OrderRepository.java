package com.foodKart.Repository;

import com.foodKart.Entities.Order;

import java.util.HashMap;
import java.util.List;

public class OrderRepository {
    public static int count=0;
    public static HashMap<String, List<Order>> orderMap = new HashMap<>();
}
