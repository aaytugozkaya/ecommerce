package com.aaytugozkaya.ecommerce.service;

import com.aaytugozkaya.ecommerce.dto.CommentDto;

import java.util.List;

public interface CommentService {

    List<CommentDto> getALlComments();
    CommentDto getCommentById(long commentId, long postId , long userId);
    List<CommentDto> getAllCommentsByPostId(long postId);
    CommentDto createComment(Long postId, CommentDto commentDto);
    CommentDto updateComment(long commentId, long postId,long userId, CommentDto commentDto);
    void deleteComment(long commentId, long postId,long userId);
}
