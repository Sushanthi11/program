package com.Centum.BankApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="customer")
public class Customer {
    @Id
    @Column(name="customer_id")
    public int customerid;
    public String customerName;
    public String customeraddress;
    public String customerphonenumber;
    public String customeremailid;
    public String aadharnumber;
    public String pancard;
  //  @OneToOne(mappedBy = "customer")
  //  private BankAccount bankAccount;
}
