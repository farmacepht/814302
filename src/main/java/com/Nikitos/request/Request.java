package com.Nikitos.request;

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
@Table(name = "requests")
@Data
@Builder

public class Request implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private Date date_of_delivery;
    private Date deadline_date;
    private String is_shipping_request;
    private String name;
    private String status;
}
