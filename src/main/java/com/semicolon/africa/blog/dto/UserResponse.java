package com.semicolon.africa.blog.dto;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private String id;
    private String name;
    private String email;
}
