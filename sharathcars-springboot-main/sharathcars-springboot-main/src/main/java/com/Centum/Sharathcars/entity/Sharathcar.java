package com.Centum.Sharathcars.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ResalesCarsList")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Sharathcar {
   @Id
   @GeneratedValue
    public int id;
    public String carcode;
    public String carname;
    public String carmodel;
    public String caryear;
    public String carcolour;
    public String carvin;
    public String carowner;
    public String state;
    public String mobilenumber;
    public String price;
    public String details;


}
