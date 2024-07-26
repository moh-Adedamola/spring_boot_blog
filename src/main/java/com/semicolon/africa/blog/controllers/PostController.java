package com.semicolon.africa.blog.controllers;

import com.semicolon.africa.blog.dto.PostRequest;
import com.semicolon.africa.blog.service.impl.PostServicesImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@Controller
@RequestMapping("/api/v1/post")
@RequiredArgsConstructor
public class PostController {
    private final PostServicesImpl postServices;

    @PostMapping("create-post")
    public ResponseEntity<?> createPost(@RequestBody PostRequest postRequest) {
    return new  ResponseEntity<>(postServices.addPost(postRequest),CREATED);
    }


    @DeleteMapping("/delete-post/{id}")
    public ResponseEntity<?> deletePost(@PathVariable("id") String postId) {
        return new ResponseEntity<>(postServices.deletePost(postId),OK);
     }


}
