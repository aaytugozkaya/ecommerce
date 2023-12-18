package com.aaytugozkaya.ecommerce.repository;

import com.aaytugozkaya.ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
