package com.semicolon.africa.blog.service.impl;

import com.semicolon.africa.blog.dto.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServicesImplTest {
    @Autowired
    private UserServicesImpl userServices;



    @Test
    void signUp() {
        UserRequest userRequest = UserRequest.builder()
                .email("test@email.com")
                .password("123456")
                .username("username")
                .build();
        UserResponse userResponse =userServices.signUp(userRequest);
        assertThat(userResponse).isNotNull();
        assertThat(userResponse.getEmail()).isEqualTo("test@email.com");
    }

    @Test
    void commentToPost() {
        CommentRequest commentRequest = CommentRequest.builder()
                .commenterId("66a173763f0e747579b96296")
                .postId("66a187d9c03d241de8726e7c")
                .comment("your post is shit!!!!!!!")
                .build();
        CommentResponse commentResponse =userServices.commentToPost(commentRequest);
      assertThat(commentResponse.getComment()).isEqualTo("your post is shit!!!!!!!");
      assertThat(commentResponse).isNotNull();
    }

    @Test
    void deleteComment() {
        CommentRequest commentRequest = CommentRequest.builder()
                .commenterId("66a173763f0e747579b96296")
                .postId("66a187d9c03d241de8726e7c")
                .comment("your post is shit!!!!!!!")
                .build();
        CommentResponse commentResponse =userServices.commentToPost(commentRequest);
        DeleteCommentRequest deleteCommentRequest = DeleteCommentRequest.builder()
                .commentId(commentResponse.getId())
                .build();
        DeleteCommentResponse deleteCommentResponse=userServices.deleteComment(deleteCommentRequest);
        assertThat(deleteCommentResponse.getMessage()).isEqualTo("comment don delete oga");
    }

    @Test
    void shareAPost() {

    }
}