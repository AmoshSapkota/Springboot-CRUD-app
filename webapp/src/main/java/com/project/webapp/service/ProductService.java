package com.project.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.webapp.model.Product;
import com.project.webapp.repository.ProductRepo;
 
@Service
public class ProductService {
    /*
    List<Product> products = new ArrayList<>(Arrays.asList(new Product(1, "laptop", 1000), new Product(2, "phone", 500),
            new Product(3, "tablet", 300)));
    */
    @Autowired
    ProductRepo repo; 
    public List<Product> getProduct() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product()); //find by id or else return empty product
        //Below return statement if database was not created using JPA
        /*return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst()
                .orElse(null);
        */
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }
    public void updateProduct(int prodId, Product prod){

        /* 
        for (int i = 0; i < products.size(); i++){
            if (products.get(i).getProdId() == prod.getProdId()){
                products.set(i, prod);
            }
        }
        */
        prod.setProdId(prodId);
        repo.save(prod);
    }
    public void deleteProduct(int prodId){
        /*
        for (int i =0; i < products.size(); i++){
            if (products.get(i).getProdId() == prodId){
                products.remove(i); 
            }
        }
        */
        repo.deleteById(prodId);
    }
    
    // Partial update for PATCH - only updates non-null/non-zero fields
    public void updateProductPartially(int prodId, Product updates) {
        Product existing = getProductById(prodId);
        if (existing != null && existing.getProdId() != 0) {
            if (updates.getProdName() != null && !updates.getProdName().isEmpty()) {
                existing.setProdName(updates.getProdName());
            }
            if (updates.getPrice() > 0) {
                existing.setPrice(updates.getPrice());
            }
            repo.save(existing);
        }
    }
}
