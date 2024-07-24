package com.semicolon.africa.blog.data.model;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
@Setter
@Getter
@RequiredArgsConstructor
public class Comment {
    @DBRef
    private User commenter;
    private String comment;
    private String id;
}
