package com.example.buy_sell.service.impl;

import com.example.buy_sell.model.OrderDetail;
import com.example.buy_sell.repository.OrderDetailRepository;
import com.example.buy_sell.service.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderDetailService implements IGeneralService<OrderDetail> {
@Autowired
private OrderDetailRepository orderDetailRepository;

    @Override
    public void save(OrderDetail orderDetail) {
        orderDetailRepository.save(orderDetail);
    }

    @Override
    public Iterable<OrderDetail> findAll() {
        return orderDetailRepository.findAll();
    }

    @Override
    public Optional<OrderDetail> findById(Long id) {
        return orderDetailRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        orderDetailRepository.deleteById(id);
    }
}
