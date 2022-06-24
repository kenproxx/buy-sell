package com.example.buy_sell.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    //id, (ManyToOne)orderId,(ManyToOne) ProductId, quantity
    private Long id;
    @ManyToOne
    private OrderBill orderBill;

    @ManyToOne
    private Product product;
    private int quantity;

    public OrderDetail() {

    }

    public OrderDetail(Long id, OrderBill orderBill, Product product, int quantity) {
        this.id = id;
        this.orderBill = orderBill;
        this.product = product;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderBill getOrderBill() {
        return orderBill;
    }

    public void setOrderBill(OrderBill orderBill) {
        this.orderBill = orderBill;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
