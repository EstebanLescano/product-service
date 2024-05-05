package org.esteban.store.productservice.controller;

import org.esteban.store.productservice.entity.ProductEntity;
import org.esteban.store.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")

public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private void createProduct(@RequestBody ProductEntity productEntity) {
        productRepository.save(productEntity);
    }

}
