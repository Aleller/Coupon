package edu.sysu.sdcs.coupon.repository;

import edu.sysu.sdcs.coupon.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
