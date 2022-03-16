package com.Nikitos.warehous;

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
@Table(name = "warehouses")
@Data
@Builder
public class Warehouse implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String address;
    private String name;
    private int number_of_sections;



}
