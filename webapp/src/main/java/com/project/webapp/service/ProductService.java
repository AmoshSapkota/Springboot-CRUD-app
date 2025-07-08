package com.project.webapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.webapp.model.Product;

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
    public void updateProductList(Product prod){
        for (int i = 0; i < products.size(); i++){
            if (products.get(i).getProdId() == prod.getProdId()){
                products.set(i, prod);
            }
        }
    }
    public void deleteProduct(int prodId){
        for (int i =0; i < products.size(); i++){
            if (products.get(i).getProdId() == prodId){
                products.remove(i); 
            }
        }
    }
}
