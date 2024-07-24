package com.semicolon.africa.blog.repo;

import com.semicolon.africa.blog.data.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Posts extends MongoRepository<Post, String> {
    Post findPostById(String id);
}
