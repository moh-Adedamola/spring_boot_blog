package com.semicolon.africa.blog.dto;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private String username;
    private String password;
    private String email;
}
