package com.Centum.smartvault.controller;

import com.Centum.smartvault.entity.Admin;
import com.Centum.smartvault.repository.Adminrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class AdminController {
    @Autowired
    private Adminrepository adminrepository;
    @PostMapping("/save admin details")
    public ResponseEntity<String>saveadmindetails(@RequestBody List<Admin>admin){
        adminrepository.saveAll(admin);
        return ResponseEntity.ok("admin details saved");
    }
}
