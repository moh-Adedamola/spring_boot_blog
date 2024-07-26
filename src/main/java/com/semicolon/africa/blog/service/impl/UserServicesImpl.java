package com.semicolon.africa.blog.service.impl;

import com.semicolon.africa.blog.data.model.Comment;
import com.semicolon.africa.blog.data.model.Post;
import com.semicolon.africa.blog.data.model.User;
import com.semicolon.africa.blog.dto.*;
import com.semicolon.africa.blog.repo.Comments;
import com.semicolon.africa.blog.repo.Posts;
import com.semicolon.africa.blog.repo.Users;
import com.semicolon.africa.blog.service.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class UserServicesImpl implements UserServices {
    private final Users users;
    private final Posts posts;
    private final Comments comments;

    @Override
    public UserResponse signUp(UserRequest userRequest) {
        User user = new User();
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        user.setName(userRequest.getUsername());
        users.save(user);
        return UserResponse.builder().email(userRequest.getEmail())
                .name(user.getName()).build();
    }

    @Override
    public CommentResponse commentToPost(CommentRequest commentRequest) {
        Post post = posts.findPostById(commentRequest.getPostId());
        Comment comment = new Comment();
        User user =users.findUserById(commentRequest.getCommenterId());
        comment.setCommenter(user);
        comment.setComment(commentRequest.getComment());
        post.setComments(new ArrayList<>());
        post.getComments().add(comment);
        comment =comments.save(comment);
        posts.save(post);
        return CommentResponse.builder()
                .commenter(UserResponse.builder()
                        .name(user.getName())
                        .email(user.getEmail()).build())
                .comment(commentRequest.getComment())
                .id(comment.getId())
                .build();
    }

    @Override
    public DeleteCommentResponse deleteComment(DeleteCommentRequest commentRequest) {
           comments.delete(comments.findCommentById(commentRequest.getCommentId()));
           return DeleteCommentResponse.builder().message("comment don delete oga").build();
    }

    @Override
    public SharePostResponse shareAPost(SharePostRequest sharePostRequest) {
        return null;
    }
}
