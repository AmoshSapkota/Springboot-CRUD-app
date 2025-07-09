package com.project.webapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Component
@Entity
public class Product {
    @Id
    private int prodId;
    private String prodName;
    private int price;

}
