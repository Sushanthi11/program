package com.Centum.VaultLocker.service;

import com.Centum.VaultLocker.dto.AdminDto;
import com.Centum.VaultLocker.dto.LoginDto;
import com.Centum.VaultLocker.entity.Admin;
import com.Centum.VaultLocker.repository.AdminRepository;
import com.Centum.VaultLocker.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    public Admin getAdminById(Integer id) {
        return adminRepository.findById(id).orElse(null);
    }

    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public Admin updateAdmin(Integer id, Admin updatedAdmin) {
        Admin existingAdmin = adminRepository.findById(id).orElse(null);
        if (existingAdmin != null) {
            existingAdmin.setAdminname(updatedAdmin.getAdminname());
            // Update other fields as needed
            return adminRepository.save(existingAdmin);
        }
        return null;
    }

    public void deleteAdmin(Integer id) {
        adminRepository.deleteById(id);
    }

    public String addAdmin(AdminDto adminDto) {
        return null;
    }

    public LoginResponse loginAdmin(LoginDto loginDto) {
        return null;
    }
}