package com.aaytugozkaya.ecommerce.service.impl;

import com.aaytugozkaya.ecommerce.dto.CommentDto;
import com.aaytugozkaya.ecommerce.service.CommentService;

import java.util.List;

public class CommentServiceImpl implements CommentService {
    @Override
    public CommentDto createComment(Long postId, CommentDto commentDto) {
        return null;
    }

    @Override
    public List<CommentDto> getALlComments() {
        return null;
    }

    @Override
    public List<CommentDto> getAllCommentsByPostId(long postId) {
        return null;
    }

    @Override
    public CommentDto getCommentById(long commentId, long postId, long userId) {
        return null;
    }

    @Override
    public CommentDto updateComment(long commentId, long postId, long userId, CommentDto commentDto) {
        return null;
    }

    @Override
    public void deleteComment(long commentId, long postId, long userId) {

    }
}
