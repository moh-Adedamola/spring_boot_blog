package com.semicolon.africa.blog.dto;

import com.semicolon.africa.blog.data.model.User;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentRequest {
    private String commenterId;
    private String comment;
    private String postId;
}
