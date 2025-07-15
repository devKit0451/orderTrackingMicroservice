package com.example.demo;


import com.example.demo.Model.OrderDataDef;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderDataDef, Long> {
    OrderDataDef getOrderDataDefById(Long order);
}
