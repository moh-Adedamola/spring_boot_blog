package com.semicolon.africa.blog.service;

import com.semicolon.africa.blog.data.model.Post;
import com.semicolon.africa.blog.dto.PostRequest;

import java.util.List;

public interface PostServices {
    Post addPost(PostRequest postRequest);
    Post updatePost(String id , String newTitle, String newContent);
    String deletePost(String id);
    List<Post> getAllPosts();
}
