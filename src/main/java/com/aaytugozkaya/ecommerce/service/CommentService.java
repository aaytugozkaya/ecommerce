package com.aaytugozkaya.ecommerce.service;

import com.aaytugozkaya.ecommerce.dto.CommentDto;

import java.util.List;

public interface CommentService {

    List<CommentDto> getALlComments();
    CommentDto getCommentById(long commentId);
    List<CommentDto> getAllCommentsByPostId(long productId);
    CommentDto createComment(Long productId,Long userId, CommentDto commentDto);
    CommentDto updateComment(long commentId, long productId,long userId, CommentDto commentDto);
    void deleteComment(long commentId, long productId,long userId);
}
