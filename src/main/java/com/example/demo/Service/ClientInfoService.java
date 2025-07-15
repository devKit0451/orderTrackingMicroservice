package com.example.demo.Service;


import com.example.demo.DTO.OrderNumber;
import com.example.demo.Model.OrderData;

public interface ClientInfoService {
    OrderData getOrderData(OrderNumber order);
}
