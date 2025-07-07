package com.project.webapp.service;

import com.project.webapp.model.Product;
import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(new Product(1, "laptop", 1000), new Product(2, "phone", 500),
            new Product(3, "tablet", 300)));

    public List<Product> getProduct() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst()
                .orElse(null);
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }

}
