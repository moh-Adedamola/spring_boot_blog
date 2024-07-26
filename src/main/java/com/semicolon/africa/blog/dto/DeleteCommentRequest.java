package com.semicolon.africa.blog.dto;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeleteCommentRequest {
    private String commentId;
}
