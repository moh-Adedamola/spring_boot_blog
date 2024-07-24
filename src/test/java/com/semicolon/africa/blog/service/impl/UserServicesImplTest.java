package com.semicolon.africa.blog.service.impl;

import com.semicolon.africa.blog.dto.UserRequest;
import com.semicolon.africa.blog.dto.UserResponse;
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


    }

    @Test
    void deleteComment() {
    }

    @Test
    void shareAPost() {
    }
}