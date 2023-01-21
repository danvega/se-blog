package dev.danvega.blog.controller;

import dev.danvega.blog.model.Post;
import dev.danvega.blog.repository.PostRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PostGraphQlController {

    private final PostRepository posts;

    public PostGraphQlController(PostRepository posts) {
        this.posts = posts;
    }

    @QueryMapping
    public List<Post> allPosts() {
        return posts.findAll();
    }

}
