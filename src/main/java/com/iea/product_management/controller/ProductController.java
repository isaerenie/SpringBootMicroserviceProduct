package com.iea.product_management.controller;

import com.iea.product_management.model.entity.Product;
import com.iea.product_management.model.service.AbstractProductService;
import com.iea.product_management.model.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("api/product")
@RestController
public class ProductController
{
    @Autowired
    private AbstractProductService productService;

    @PostMapping
    public ResponseEntity<Product>  kaydet(@RequestBody Product product)
    {
        product.setCreated(new Date());
        Product savedProduct = productService.save(product);

        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product)
    {
        product.setCreated(new Date());
        Product savedProduct = productService.save(product);

        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }
}
