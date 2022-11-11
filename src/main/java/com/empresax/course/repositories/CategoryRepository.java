package com.empresax.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresax.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
