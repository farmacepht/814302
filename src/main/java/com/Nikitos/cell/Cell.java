package com.Nikitos.cell;

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
@Table(name = "cells")
@Data
@Builder

public class Cell implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private float area;
    private int number;
}
