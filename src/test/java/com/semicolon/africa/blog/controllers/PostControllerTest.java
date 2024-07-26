package com.semicolon.africa.blog.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.semicolon.africa.blog.dto.PostRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PostControllerTest {
   @Autowired
    private MockMvc mockMvc;

    @Test
    public void createPost() throws Exception {
        PostRequest postRequest = new PostRequest();
        postRequest.setTitle("Title");
        postRequest.setContent("Content");
        ObjectMapper objectMapper = new ObjectMapper();
        mockMvc.perform(post("/api/v1/post/create-post")
            .content(objectMapper.writeValueAsBytes(postRequest))
            .contentType("application/json")
        ).andExpect(status().isCreated())
         .andDo(print());
    }


}