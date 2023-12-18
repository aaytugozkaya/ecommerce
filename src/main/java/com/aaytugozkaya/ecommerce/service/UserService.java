package com.aaytugozkaya.ecommerce.service;

import com.aaytugozkaya.ecommerce.dto.UserDto;
import com.aaytugozkaya.ecommerce.entity.User;

import java.util.List;

public interface UserService {

    List<UserDto> getAllUsers();
    UserDto getUserById(long id);
    UserDto createUser(UserDto userDto);
    UserDto updateUser(long id,UserDto userDto);
    void deleteUser(long id);


}
