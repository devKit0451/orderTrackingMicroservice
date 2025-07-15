package com.example.demo.Service;

import com.example.demo.DTO.OrderNumber;
import com.example.demo.Model.OrderData;
import com.example.demo.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientInfoStandardService implements ClientInfoService {
    OrderRepository orderRepository;

    @Override
    public OrderData getOrderData(OrderNumber order) {
        return orderRepository.getOrderDataDefById(order.getOrderId());
    }
}
