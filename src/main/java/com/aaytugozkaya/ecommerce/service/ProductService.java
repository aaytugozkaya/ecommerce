package com.aaytugozkaya.ecommerce.service;

import com.aaytugozkaya.ecommerce.dto.UserDto;

import java.util.List;

public interface ProductService {
    List<UserDto> getAllUsers();
    UserDto getUserById(long id);
    UserDto createUser(UserDto userDto);
    UserDto updateUser(long id,UserDto userDto);
    void deleteUser(long id);
}
