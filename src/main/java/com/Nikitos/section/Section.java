package com.Nikitos.section;

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
@Table(name = "sections")
@Data
@Builder

public class Section implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private int section_priority;
    private int number;
    private int number_of_cells;
    private String product_type;
}
