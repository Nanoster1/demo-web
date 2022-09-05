package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService
{
    public List<Post> listAllPosts() {
        var posts = new ArrayList<Post>();
        posts.add(new Post("Some text", 2));
        posts.add(new Post("Some text 2", 3));
        posts.add(new Post("Super Post", 0));
        return posts;
    }
}