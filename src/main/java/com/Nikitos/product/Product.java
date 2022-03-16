package com.Nikitos.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
@Data
@Builder

public class Product implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int product_priority;
    private int quantity;
    private String supplier;
}
