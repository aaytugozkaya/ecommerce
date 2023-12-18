package com.aaytugozkaya.ecommerce.repository;

import com.aaytugozkaya.ecommerce.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
