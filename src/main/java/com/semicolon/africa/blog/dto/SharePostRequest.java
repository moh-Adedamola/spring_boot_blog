package com.semicolon.africa.blog.dto;
import lombok.*;
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SharePostRequest {
    private String postAuthorId;
    private String postRecipientId;
    private String postId;
}
