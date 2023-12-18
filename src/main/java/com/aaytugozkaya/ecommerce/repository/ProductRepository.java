package com.aaytugozkaya.ecommerce.repository;

import com.aaytugozkaya.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
