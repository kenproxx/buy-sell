package com.example.buy_sell.controller;

import com.example.buy_sell.model.OrderBill;
import com.example.buy_sell.model.OrderDetail;
import com.example.buy_sell.repository.OrderRepository;
import com.example.buy_sell.service.impl.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@CrossOrigin("*")
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderRepository orderRepository;



    @GetMapping
    public ResponseEntity<Iterable<OrderBill>> findAll() {
        Iterable<OrderBill> orders = orderService.findAll();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }
    @GetMapping("/find-by-order-id")
    public ResponseEntity<Iterable<OrderBill>> findByOrderId() {
        Iterable<OrderBill> orders = orderRepository.findAllOrderBill();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }


}
