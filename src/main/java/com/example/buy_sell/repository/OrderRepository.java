package com.example.buy_sell.repository;

import com.example.buy_sell.model.OrderBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderBill, Long> {
    @Modifying
    @Query(value = "select  order_bill.id ,(price* od.quantity) as totalPrice\n" +
            "from order_bill join order_detail od on order_bill.id = od.order_bill_id\n" +
            "join product p on od.product_id = p.id", nativeQuery = true)
    Iterable<OrderBill> findAllOrderBill();


}
