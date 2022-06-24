package com.example.buy_sell.controller;

import com.example.buy_sell.model.Product;
import com.example.buy_sell.repository.ProductRepository;
import com.example.buy_sell.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/products")
@CrossOrigin("*")
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    ProductRepository productRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Product>> findAll() {
        return new ResponseEntity<>(productRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/quantity300")
    public ResponseEntity<Iterable<Product>> findAllQuantity300() {
        return new ResponseEntity<>(productRepository.findProductWithQuantityGreaterThan300(), HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<Iterable<Product>> findAllByName(@RequestParam String name) {
        return new ResponseEntity<>(productRepository.findByNameContaining(name), HttpStatus.OK);
    }

    @GetMapping("/search-by-price")
    public ResponseEntity<Iterable<Product>> findAllByPrice(@RequestParam  int one, @RequestParam int two) {
        return new ResponseEntity<>(productRepository.findProductByPriceBetween(one, two), HttpStatus.OK);
    }

    //add new product
    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@ModelAttribute Product product) {
        return new ResponseEntity<>(productRepository.save(product), HttpStatus.OK);
    }

    //delete product by id
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //update product by id
    @PutMapping("/update/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @ModelAttribute Product product) {
        product.setId(id);
        return new ResponseEntity<>(productRepository.save(product), HttpStatus.OK);
    }




}
