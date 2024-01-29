package com.example.posts.controller;

import com.example.posts.dto.PostRequestDto;
import com.example.posts.dto.PostResponseDto;
import com.example.posts.service.PostServiceImpl;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/posts")
public class PostController {
    private final PostServiceImpl postService;

    @PostMapping
    public PostResponseDto save(@RequestBody PostRequestDto requestDto) {
        return postService.save(requestDto);
    }

    @GetMapping
    public List<PostResponseDto> getAll(Pageable pageable) {
        return postService.findAll(pageable);
    }
}
