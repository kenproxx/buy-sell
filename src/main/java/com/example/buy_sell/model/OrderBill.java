package com.example.buy_sell.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderBill {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    //id, createAt, totalPrice, customerName
    private Long id;
    private String createAt;
    private int totalPrice;
    private String customerName;

    public OrderBill() {
    }

    public OrderBill(Long id, String createAt, int totalPrice, String customerName) {
        this.id = id;
        this.createAt = createAt;
        this.totalPrice = totalPrice;
        this.customerName = customerName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
