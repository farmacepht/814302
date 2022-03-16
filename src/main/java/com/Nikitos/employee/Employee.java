package com.Nikitos.employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employees")
@Data
@Builder

public class Employee implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private Date date_of_birth;
    private String email;
    private Date employment_date;
    private String password;
    private String full_name;
    private String phone_number;
    private int postion_id;
}
