package com.example.demo.DTO;

import lombok.Data;

@Data
public class OrderNumberStandard implements OrderNumber {
    private final long orderId;
}
