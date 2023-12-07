package com.Centum.NationalMart.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    public int customerid;
    public String customername;
    public String customerphone;
    public String customerEmail;
    public String gender;
    public String address;
    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn(name="cp_fk",referencedColumnName="customerid")
    private List<Product> product;
}
