package com.Centum.NationalMart.repository;

import com.Centum.NationalMart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Productrepository extends JpaRepository<Product,Integer> {
}