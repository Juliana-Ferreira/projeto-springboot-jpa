package com.empresax.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresax.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
