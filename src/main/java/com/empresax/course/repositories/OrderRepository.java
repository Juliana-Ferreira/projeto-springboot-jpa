package com.empresax.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresax.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
