package com.springboot.blog.payload;

public record PostDto(long id, String title, String description, String content) {
}
