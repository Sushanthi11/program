package com.Centum.smartvault.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Admin {
    @Id
    @GeneratedValue
    public int adminID;
    public String adminName;
}
