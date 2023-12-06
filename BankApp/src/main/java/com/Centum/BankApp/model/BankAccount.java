package com.Centum.BankApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="bankaccount")
public class BankAccount {
    @Id
    @Column(name ="bank_id")
    public int bankid;
    public String bankname;
    public String bankaddress;
    public String bankifsccode;
    public String bankbranch;
    public String banknumber;
    public String customerId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_add_customer")
    private Customer Customer;
}
