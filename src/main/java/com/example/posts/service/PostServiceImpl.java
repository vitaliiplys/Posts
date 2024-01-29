package com.example.posts.service;

import com.example.posts.dto.PostRequestDto;
import com.example.posts.dto.PostResponseDto;
import com.example.posts.mapper.PostMapper;
import com.example.posts.model.Post;
import com.example.posts.repository.PostRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;
    private final PostMapper postMapper;

    @Override
    public PostResponseDto save(PostRequestDto requestDto) {
        Post post = postMapper.toModel(requestDto);
        return postMapper.toDto(postRepository.save(post));
    }

    @Override
    public List<PostResponseDto> findAll(Pageable pageable) {
        return postRepository.findAll().stream()
                .map(postMapper::toDto)
                .toList();
    }
}
