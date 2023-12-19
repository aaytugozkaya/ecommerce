package com.aaytugozkaya.ecommerce.controller;

import com.aaytugozkaya.ecommerce.dto.CommentDto;
import com.aaytugozkaya.ecommerce.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comment")
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<CommentDto>> getAllComments(){
        return ResponseEntity.ok(commentService.getALlComments());
    }

    @GetMapping("/getCommentsByProduct/{productId}")
    public ResponseEntity<List<CommentDto>> getAllCommentsByProductId(@PathVariable(name = "productId") Long productId){
        return ResponseEntity.ok(commentService.getAllCommentsByPostId(productId));
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<CommentDto> getCommentById(@PathVariable(name = "id") Long commentId){
        return ResponseEntity.ok(commentService.getCommentById(commentId));
    }

    @PostMapping("/{productId}/{userId}")
    public ResponseEntity<CommentDto> createComment(@PathVariable(name = "productId") Long productId,
                                                    @PathVariable(name = "userId")Long userId,
                                                    @RequestBody CommentDto commentDto){

        return ResponseEntity.ok(commentService.createComment(productId,userId,commentDto));
    }

    @PutMapping("/{commentId}/{productId}/{userId}")
    public ResponseEntity<CommentDto> updateComment(@PathVariable(name = "commentId") Long commentId,
                                                    @PathVariable(name = "productId") Long productId,
                                                    @PathVariable(name = "userId")Long userId,
                                                    @RequestBody CommentDto commentDto){

        return ResponseEntity.ok(commentService.updateComment(commentId,productId,userId,commentDto));
    }

    @DeleteMapping("/{commentId}/{productId}/{userId}")
    public void deleteComment(@PathVariable(name = "commentId") Long commentId,
                              @PathVariable(name = "productId") Long productId,
                              @PathVariable(name = "userId")Long userId){

         commentService.deleteComment(commentId,productId,userId);
    }



}
