package com.semicolon.africa.blog.data.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Post {
    private String id;
    private String title;
    private String content;
    @DBRef
    private List<Comment> comments;
}
