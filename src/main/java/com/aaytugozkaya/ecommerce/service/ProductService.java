package com.aaytugozkaya.ecommerce.service;

import com.aaytugozkaya.ecommerce.dto.ProductDto;
import com.aaytugozkaya.ecommerce.dto.UserDto;
import com.aaytugozkaya.ecommerce.entity.Product;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAllProduct();
    Product findById(long id);
    ProductDto createProduct(UserDto userDto);
    ProductDto updateProduct(long id,UserDto userDto);
    void deleteProduct(long id);
}
