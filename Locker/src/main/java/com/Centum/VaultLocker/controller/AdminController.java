package com.Centum.VaultLocker.controller;

import com.Centum.VaultLocker.dto.AdminDto;
import com.Centum.VaultLocker.dto.LoginDto;
import com.Centum.VaultLocker.entity.Admin;
import com.Centum.VaultLocker.entity.Locker;
import com.Centum.VaultLocker.response.LoginResponse;
import com.Centum.VaultLocker.service.AdminService;
import com.Centum.VaultLocker.service.LockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private LockerService lockerService;
    @PostMapping(path = "/save")
    public String saveAdmin(@RequestBody AdminDto adminDto){
        String id = adminService.addAdmin(adminDto);
        return id;
    }
    @PostMapping(path = "/login")
    public ResponseEntity<?>LoginAdmin(@RequestBody LoginDto loginDto){
        LoginResponse loginResponse= adminService.loginAdmin(loginDto);
        return ResponseEntity.ok(loginResponse);
    }

    @GetMapping("/Lockers")
    public List<Locker> getAllLockers() {
        return lockerService.getAllLockers();
    }
    @PostMapping("/savelocker")
    public Locker saveLocker(@RequestBody Locker locker) {
        return lockerService.saveLocker(locker);
    }


    @GetMapping("/")
    public List<Admin> getAllAdmins() {
        return adminService.getAllAdmins();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Admin> getAdminById(@PathVariable Integer id) {
        Admin admin = adminService.getAdminById(id);
        if (admin != null) {
            return ResponseEntity.ok(admin);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/")
    public ResponseEntity<Admin> createAdmin(@RequestBody Admin admin) {
        Admin createdAdmin = adminService.createAdmin(admin);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAdmin);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Admin> updateAdmin(@PathVariable Integer id, @RequestBody Admin updatedAdmin) {
        Admin admin = adminService.updateAdmin(id, updatedAdmin);
        if (admin != null) {
            return ResponseEntity.ok(admin);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}