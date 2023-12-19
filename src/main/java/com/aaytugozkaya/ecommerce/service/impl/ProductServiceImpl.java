package com.aaytugozkaya.ecommerce.service.impl;

import com.aaytugozkaya.ecommerce.dto.ProductDto;
import com.aaytugozkaya.ecommerce.dto.UserDto;
import com.aaytugozkaya.ecommerce.entity.Product;
import com.aaytugozkaya.ecommerce.exception.ResourceNotFoundException;
import com.aaytugozkaya.ecommerce.repository.ProductRepository;
import com.aaytugozkaya.ecommerce.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;
    @Override
    public List<ProductDto> getAllProduct() {
        return null;
    }

    @Override
    public Product findById(long id) {
        return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("product","id",id));
    }

    @Override
    public ProductDto createProduct(UserDto userDto) {
        return null;
    }

    @Override
    public ProductDto updateProduct(long id, UserDto userDto) {
        return null;
    }

    @Override
    public void deleteProduct(long id) {

    }
}
