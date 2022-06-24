package com.example.buy_sell.dto;

public interface OrderDetailDTO {
    Long getId();
    Integer getQuantity();
    Long getProductId();
    Long getOrderId();
    String getProductName();
    Integer getProductPrice();
    String getOrderCustomerName();


}
