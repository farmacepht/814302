package com.Nikitos.department;

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
@Table(name = "departments")
@Data
@Builder

public class Department implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String office_adress;
    private String name;
}
