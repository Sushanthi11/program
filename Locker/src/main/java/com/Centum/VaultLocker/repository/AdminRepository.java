package com.Centum.VaultLocker.repository;

import com.Centum.VaultLocker.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Optional<Admin> findOneByEmailAndPassword(String email, String password);
    Admin findByEmail(String email);

}
