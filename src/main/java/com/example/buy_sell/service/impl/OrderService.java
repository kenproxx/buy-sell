package com.example.buy_sell.service.impl;

import com.example.buy_sell.controller.OrderController;
import com.example.buy_sell.model.OrderBill;
import com.example.buy_sell.repository.OrderRepository;
import com.example.buy_sell.service.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService implements IGeneralService<OrderBill> {
@Autowired
private OrderRepository orderRepository;
    @Override
    public void save(OrderBill orderBill) {
        orderRepository.save(orderBill);
    }

    @Override
    public Iterable<OrderBill> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<OrderBill> findById(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        orderRepository.deleteById(id);
    }

}
