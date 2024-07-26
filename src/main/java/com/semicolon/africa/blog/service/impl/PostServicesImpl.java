package com.semicolon.africa.blog.service.impl;

import com.semicolon.africa.blog.data.model.Post;
import com.semicolon.africa.blog.dto.PostRequest;
import com.semicolon.africa.blog.repo.Posts;
import com.semicolon.africa.blog.service.PostServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostServicesImpl implements PostServices {
    private final Posts posts;
    @Override
    public Post addPost(PostRequest postRequest) {
        Post post = new Post();
        post.setTitle(postRequest.getTitle());
        post.setContent(postRequest.getContent());
        return posts.save(post);
    }

    @Override
    public Post updatePost(String id, String newTitle, String newContent) {
         Post post = posts.findPostById(id);
         post.setTitle(newTitle);
         post.setContent(newContent);
         return posts.save(post);
    }

    @Override
    public String deletePost(String id) {
        Post post = posts.findPostById(id);
        posts.delete(post);
        return "post deleted";
    }



    @Override
    public List<Post> getAllPosts() {
        return posts.findAll();
    }

}
