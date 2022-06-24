package com.example.buy_sell.repository;

import com.example.buy_sell.dto.OrderDetailDTO;
import com.example.buy_sell.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
    @Query(value = "select od.id as id, od.quantity as quantity, " +
            " p.name as productName, p.price  as productPrice, ob.customer_name as customerName " +
            "from order_detail od " +
            "join product p on p.id = od.product_id " +
            "join order_bill ob on ob.id = od.order_bill_id", nativeQuery = true)
    List<OrderDetailDTO> findAllById();
}
