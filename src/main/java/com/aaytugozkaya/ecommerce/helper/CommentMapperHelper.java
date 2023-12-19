package com.aaytugozkaya.ecommerce.helper;

import com.aaytugozkaya.ecommerce.dto.CommentDto;
import com.aaytugozkaya.ecommerce.dto.ProductDto;
import com.aaytugozkaya.ecommerce.dto.UserDto;
import com.aaytugozkaya.ecommerce.entity.Comment;
import com.aaytugozkaya.ecommerce.entity.Product;
import com.aaytugozkaya.ecommerce.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface CommentMapperHelper {
    static CommentDto mapToDto(Comment comment){

        return CommentDto.builder()
                .id(comment.getId())
                .description(comment.getDescription())
                .commentDate(comment.getCommentDate())
//                .productDto(
//                        ProductDto.builder()
//                                .id(comment.getProduct().getId())
//                                .build()
//                )
//                .userDto(UserDto.builder()
//                        .id(comment.getProduct().getId())
//                        .build())
                .build();
    }

    static Comment mapToEntity(CommentDto commentDto){
        return Comment.builder()
                .id(commentDto.getId())
                .description(commentDto.getDescription())
                .commentDate(commentDto.getCommentDate())
//                .product(Product.builder()
//                        .id(commentDto.getProductDto().getId())
//                        .build())
//                .user(User.builder()
//                        .id(commentDto.getUserDto().getId())
//                        .build())
                .build();
    }
}
