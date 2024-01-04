package com.Centum.smartvault.repository;

import com.Centum.smartvault.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository<User,Integer> {
}
