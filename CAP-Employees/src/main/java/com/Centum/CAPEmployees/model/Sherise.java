package com.Centum.CAPEmployees.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employee")
@NoArgsConstructor
@AllArgsConstructor
public class Sherise {
    @Id
    @GeneratedValue
    public int id;
    public String Employeecode;
    public String name;
    public String emailid;
    public String phnumber;
    public String address;
    public String DOB;
    public String Gender;
}
