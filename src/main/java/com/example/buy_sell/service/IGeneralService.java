package com.example.buy_sell.service;

import java.util.Optional;

public interface IGeneralService<T> {
    void save(T t);
    Iterable<T> findAll();
    Optional<T> findById(Long id);
    void delete(Long id);
}
