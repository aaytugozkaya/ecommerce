package com.aaytugozkaya.ecommerce.dto;

import com.aaytugozkaya.ecommerce.entity.Comment;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class UserDto {
    private long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String phone;
    private String address;
    @JsonProperty("comment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Set<CommentDto> comments = new HashSet<>();
}
