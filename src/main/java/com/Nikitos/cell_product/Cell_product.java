package com.Nikitos.cell_product;

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
@Table(name = "cell_product")
@Data
@Builder

public class Cell_product implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private int quantity;
}
