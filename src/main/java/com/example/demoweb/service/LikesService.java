package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;
import com.example.demoweb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class LikesService
{
    @Autowired
    PostService postService;
    @Autowired
    PostRepository postRepository;

    public int like(Long postId) {
        Post post = postRepository.findById(postId).get();
        post.setLikes(post.getLikes() + 1);

        postRepository.save(post);
        return post.getLikes();
    }
}
