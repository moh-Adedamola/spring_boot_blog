package com.semicolon.africa.blog.repo;

import com.semicolon.africa.blog.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface Users extends MongoRepository<User, String> {
    User findUserByEmail(String email);
    User findUserByName(String username);
    User findUserById(String id);
}
