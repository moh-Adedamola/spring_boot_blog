package com.semicolon.africa.blog.repo;
import com.semicolon.africa.blog.data.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Comments extends MongoRepository<Comment, String> {

}
