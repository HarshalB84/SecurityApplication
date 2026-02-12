package com.practice.SecurityApp.SecurityApplication.controller;

import com.practice.SecurityApp.SecurityApplication.dto.PostDto;
import com.practice.SecurityApp.SecurityApplication.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping
    @Secured({"ROLE_USER", "ROLE_ADMIN"})
    public List<PostDto> getAllPost(){
        return postService.getAllPosts();
    }

    @GetMapping("/{postId}")
//    @PreAuthorize("hasAnyRole('USER','ADMIN') OR hasAnyAuthority('POST_VIEW")
    @PreAuthorize("@postSecurity.isOwnerOfPost(#postId)")
    public PostDto getPostById(@PathVariable Long postId){
        return postService.getPostById(postId);
    }

    @PostMapping
    public PostDto createNewPost(@RequestBody PostDto inputPost){
        return postService.createNewPost(inputPost);
    }


}
