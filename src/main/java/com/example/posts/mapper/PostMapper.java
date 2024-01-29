package com.example.posts.mapper;

import com.example.posts.config.MapperConfig;
import com.example.posts.dto.PostRequestDto;
import com.example.posts.dto.PostResponseDto;
import com.example.posts.model.Post;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface PostMapper {
    PostResponseDto toDto(Post post);

    Post toModel(PostRequestDto requestDto);
}
