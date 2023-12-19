package com.aaytugozkaya.ecommerce.dto;

import com.aaytugozkaya.ecommerce.entity.Comment;
import com.aaytugozkaya.ecommerce.entity.Product;
import com.aaytugozkaya.ecommerce.entity.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class CommentDto {
    private long id;
    private String description;
    private LocalDate commentDate;

}
