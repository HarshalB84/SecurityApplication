package com.practice.SecurityApp.SecurityApplication.service;

import com.practice.SecurityApp.SecurityApplication.dto.PostDto;

import java.util.List;

public interface PostService {

    List<PostDto> getAllPosts();

    PostDto createNewPost(PostDto inputPost);

    PostDto getPostById(Long postId);

}