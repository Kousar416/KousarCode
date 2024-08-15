package com.thinkconstructive.post_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {
    @GetMapping(value="/{postId}")

    public post getPosts(@PathVariable("postId") String postId){
        post postOne=new post(postId, "post description for "+postId);
        return postOne;
    }
}
