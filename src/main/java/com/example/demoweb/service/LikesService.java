package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

@Service
public class LikesService
{
    private final PostService postService;

    public LikesService(PostService postService)
    {
        this.postService = postService;
    }

    public int like(Long postId){
        Post post = postService.listAllPosts().get(postId.intValue() - 1);
        post.setLikes(post.getLikes() + 1);
        return post.getLikes();
    }
}
