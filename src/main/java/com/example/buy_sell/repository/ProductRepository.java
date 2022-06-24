package com.example.buy_sell.repository;

import com.example.buy_sell.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
//find product with quantity > 300

    //find product by price between int and int
    @Query(value = "SELECT * FROM product WHERE price BETWEEN ?1 AND ?2", nativeQuery = true)
       List<Product> findProductByPriceBetween(@RequestParam int price1, @RequestParam int price2);



    //find all by name
    List<Product> findByNameContaining(String name);
    @Query("select p from Product p where p.quantity > 300")
    List<Product> findProductWithQuantityGreaterThan300();

//find product by name contains
    @Query("select p from Product p where p.name like %?1%")
    List<Product> findProductByNameContains(String name);

//add product





}
