package com.semicolon.africa.blog.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PostRequest {
    private String title;
    private String content;
}
