package com.test.repository;

import com.test.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {

    Optional<Orders> findByOrderId(int orderId);
}
