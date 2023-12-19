package com.aaytugozkaya.ecommerce.dto;

import com.aaytugozkaya.ecommerce.entity.Comment;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ProductDto {
    private long id;

    private String name;
    private String description;
    private double price;
    private String imageUrl;
    private int stock;

    @JsonProperty("comment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Set<CommentDto> commentsDto = new HashSet<>();
}
