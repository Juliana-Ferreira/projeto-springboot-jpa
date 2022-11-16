package com.empresax.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresax.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
