package com.Centum.smartvault.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class User {
    @Id
    public int userID;
    public String Name;
    public String email;
    public String phonenumber;
    public String accountnumber;
    public String cardnumber;
    public String lockerID;
}