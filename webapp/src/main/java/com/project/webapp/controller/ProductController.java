package com.project.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.webapp.model.Product;
import com.project.webapp.service.ProductService;

import java.util.List;

import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProduct() {
        return service.getProduct();
    }

    @RequestMapping("/product/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }

    // using @PostMapping for post operation as @RequestMapping is get by default
    @PostMapping("/product")
    public String addProduct(@RequestBody Product prod) {
        service.addProduct(prod);
        return "Product added Successfully";
    }
    @PutMapping("/products")
    public String updateProduct(@RequestBody Product prod){
        service.updateProductList(prod);
        return "Product List updated Successfully!";

    }
    @DeleteMapping("/products/{prodId}")
    public String deleteProduct(@PathVariable Product prodId){
        service.deleteProduct(prodId);
        return "Product deleted Successfully!"
    }

}
