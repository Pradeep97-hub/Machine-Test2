package com.javatechie.crud.example.repository;

import com.javatechie.crud.example.entity.Product;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> 
{

	Product findByName(String name);

	Product save(Optional<Product> existingProduct);
}
