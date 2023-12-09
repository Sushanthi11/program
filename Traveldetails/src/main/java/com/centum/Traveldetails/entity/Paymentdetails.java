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
@Table(name="paymentdetails")
public class Paymentdetails {
    @Id
    @GeneratedValue
    public Long paymentid;
    public String bookingid;
    public String paymentdate;
    public String amount;
    public String paymentmethod;
}
