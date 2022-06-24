package com.example.buy_sell.controller;

import com.example.buy_sell.dto.OrderDetailDTO;
import com.example.buy_sell.model.OrderDetail;
import com.example.buy_sell.repository.OrderDetailRepository;
import com.example.buy_sell.service.impl.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/order-details")
@CrossOrigin("*")
public class OrderDetailController {
    @Autowired
    private OrderDetailService orderDetailService;
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<OrderDetail>> findAll() {
        Iterable<OrderDetail> orders = orderDetailService.findAll();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping("/test")
    public ResponseEntity<Iterable<OrderDetailDTO>> findAllById() {
        Iterable<OrderDetailDTO> orders = orderDetailRepository.findAllById();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }



}
