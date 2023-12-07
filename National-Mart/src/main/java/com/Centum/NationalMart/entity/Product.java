package com.Centum.NationalMart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    public int pid;
    public String productname;
    public String productprice;
    public String productqty;
    public String promoprice;
    public String promostart;
    public String promoend;
    public String description;
}
