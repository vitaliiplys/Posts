package com.example.posts.service;

import com.example.posts.dto.PostRequestDto;
import com.example.posts.dto.PostResponseDto;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface PostService {
    PostResponseDto save(PostRequestDto requestDto);

    List<PostResponseDto> findAll(Pageable pageable);
}
