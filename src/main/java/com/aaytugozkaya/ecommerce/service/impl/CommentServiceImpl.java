package com.aaytugozkaya.ecommerce.service.impl;

import com.aaytugozkaya.ecommerce.dto.CommentDto;
import com.aaytugozkaya.ecommerce.entity.Comment;
import com.aaytugozkaya.ecommerce.entity.Product;
import com.aaytugozkaya.ecommerce.entity.User;
import com.aaytugozkaya.ecommerce.exception.ResourceNotFoundException;
import com.aaytugozkaya.ecommerce.helper.CommentMapperHelper;
import com.aaytugozkaya.ecommerce.repository.CommentRepository;
import com.aaytugozkaya.ecommerce.repository.ProductRepository;
import com.aaytugozkaya.ecommerce.repository.UserRepository;
import com.aaytugozkaya.ecommerce.service.CommentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentService {

    CommentRepository commentRepository;
    ProductRepository productRepository;
    UserRepository userRepository;

    public CommentServiceImpl(CommentRepository commentRepository, ProductRepository productRepository, UserRepository userRepository) {
        this.commentRepository = commentRepository;
        this.productRepository = productRepository;
        this.userRepository = userRepository;
    }

    @Override
    public CommentDto createComment(Long productId,Long userId, CommentDto commentDto) {
        Comment comment = CommentMapperHelper.mapToEntity(commentDto);
        Product product = productRepository.findById(productId).orElseThrow(() -> new ResourceNotFoundException("product", "id ",productId));
        User user = userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("user","id ",userId));
        comment.setUser(user);
        comment.setProduct(product);


        return CommentMapperHelper.mapToDto(this.commentRepository.save(comment));
    }

    @Override
    public List<CommentDto> getALlComments() {
        List<Comment> comments = commentRepository.findAll();
        return comments.stream().map(CommentMapperHelper::mapToDto).collect(Collectors.toList());
    }

    @Override
    public List<CommentDto> getAllCommentsByPostId(long productId) {
        List<Comment> comments = commentRepository.findByProductId(productId);
        return comments.stream().map(CommentMapperHelper::mapToDto).collect(Collectors.toList());
    }

    @Override
    public CommentDto getCommentById(long commentId) {
        Comment comment = commentRepository.findById(commentId).orElseThrow(RuntimeException::new);

        return CommentMapperHelper.mapToDto(comment);
    }

    @Override
    public CommentDto updateComment(long commentId, long productId, long userId, CommentDto commentDto) {
        Product product = productRepository.findById(productId).orElseThrow(()-> new ResourceNotFoundException("product","productId", productId));
        Comment comment = commentRepository.findById(commentId).orElseThrow(() -> new ResourceNotFoundException("comment", "commentId", userId));
        User user = userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("user","userId", userId));

        if(comment.getProduct().getId() == product.getId() && comment.getUser().getId() == user.getId()){
            comment.setCommentDate(commentDto.getCommentDate());
            comment.setDescription(commentDto.getDescription());

            return CommentMapperHelper.mapToDto(this.commentRepository.save(comment));
        }
        else throw new ResourceNotFoundException("comment", "commentId",commentId);
    }

    @Override
    public void deleteComment(long commentId, long productId, long userId) {
        Product product = productRepository.findById(productId).orElseThrow(() -> new ResourceNotFoundException("Product","id",productId));
        Comment comment = commentRepository.findById(commentId).orElseThrow(() -> new ResourceNotFoundException("Post","id",commentId));
        User user = userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("user","userId",userId));
        if(comment.getProduct().getId()== product.getId() && comment.getUser().getId()==user.getId()){
            commentRepository.delete(comment);
        }
        else throw new ResourceNotFoundException("comment", "commentId",commentId);
    }
}
