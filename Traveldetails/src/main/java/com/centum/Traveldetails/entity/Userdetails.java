package com.centum.Traveldetails.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="userdetails")
public class Userdetails {
    @Id
    @GeneratedValue
    public Long userid;
    public String username;
    public String useremail;
    public String usermobile;
    public String address;
    @OneToMany(mappedBy = "tripDetails")
    private List<Bookingdetails> bookings;
}
