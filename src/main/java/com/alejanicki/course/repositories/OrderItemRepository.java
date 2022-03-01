package com.alejanicki.course.repositories;

import com.alejanicki.course.entities.OrderItem;
import com.alejanicki.course.entities.pk.OrderItemPK;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}