package com.apeng.smartlogisticsbackend.service;

import com.apeng.smartlogisticsbackend.dto.OrderRequest;
import com.apeng.smartlogisticsbackend.dto.OrderResponse;
import com.apeng.smartlogisticsbackend.entity.Order;

import java.util.List;

public interface OrderService {
    Long insert(Order order);
    void deleteById(Long id);
    OrderResponse findById(Long id);
    List<OrderResponse> findAll();
    OrderResponse update(Order order);
    OrderResponse submit(OrderRequest order);
}
