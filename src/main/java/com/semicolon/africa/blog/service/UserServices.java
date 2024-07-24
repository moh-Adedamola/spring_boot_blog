package com.semicolon.africa.blog.service;

import com.semicolon.africa.blog.data.model.Post;
import com.semicolon.africa.blog.dto.*;

public interface UserServices {
 UserResponse signUp(UserRequest userRequest);
CommentResponse commentToPost(CommentRequest commentRequest);
CommentResponse deleteComment(CommentRequest commentRequest);
SharePostResponse shareAPost (SharePostRequest sharePostRequest);
}
