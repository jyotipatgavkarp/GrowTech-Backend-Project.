package com.agroproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agroproject.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	Product save(Product product);

}
