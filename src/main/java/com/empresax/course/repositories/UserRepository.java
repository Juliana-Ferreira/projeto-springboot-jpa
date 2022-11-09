package com.empresax.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresax.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
