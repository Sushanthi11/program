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
@Table(name="bookingdetails")
public class Bookingdetails {
    @Id
    @GeneratedValue
    public Long bookingid;
    public String userid;
    public String tripid;
    public String datebooked;
    public String totalprice;
}