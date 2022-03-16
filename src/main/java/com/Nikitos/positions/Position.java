package com.Nikitos.positions;

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
@Table(name = "positions")
@Data
@Builder

public class Position implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String is_executive_positions;
    private float salary;

}
