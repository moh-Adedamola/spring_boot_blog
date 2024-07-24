package com.semicolon.africa.blog.service;

import com.semicolon.africa.blog.data.model.Post;

import java.util.List;

public interface PostServices {
    Post addPost(String title, String content);
    Post updatePost(String id , String newTitle, String newContent);
    String deletePost(String id);
    List<Post> getAllPosts();
}
