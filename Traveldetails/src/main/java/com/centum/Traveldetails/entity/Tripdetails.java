package com.centum.Traveldetails.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="tripdetails")
public class Tripdetails {
    @Id
    @GeneratedValue
    public Long tripid;
    public String destination;
    public String date;
    public String durationdays;
    public String price;
    
}
