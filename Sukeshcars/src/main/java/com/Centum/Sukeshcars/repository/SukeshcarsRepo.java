package com.Centum.Sukeshcars.repository;

import com.Centum.Sukeshcars.entity.Sukeshcar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SukeshcarsRepo  extends JpaRepository<Sukeshcar,Integer> {
    Sukeshcar findById(int id);
}