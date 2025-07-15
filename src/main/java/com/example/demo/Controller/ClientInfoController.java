package com.example.demo.Controller;

import com.example.demo.DTO.OrderNumberStandard;
import com.example.demo.Model.OrderData;
import com.example.demo.Service.ClientInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientInfoController {
    @Autowired
    ClientInfoService orderService;

    @GetMapping("/id")
    public OrderData getOrderId(@RequestParam(value = "orderId") long orderId) {
        OrderNumberStandard order = new OrderNumberStandard(orderId);
        return orderService.getOrderData(order);
    }
}
