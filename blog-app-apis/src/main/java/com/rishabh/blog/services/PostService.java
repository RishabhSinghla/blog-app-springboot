package com.rishabh.blog.services;

import java.util.List;

import com.rishabh.blog.payloads.PostDto;
import com.rishabh.blog.payloads.PostResponse;

public interface PostService {

	// create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

	// update
	PostDto updatePost(PostDto postDto, Integer postId);

	// delete
	void deletePost(Integer postId);

	// get all posts
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);

	// get single Post
	PostDto getPostById(Integer postId);

	// get all post by Category
	List<PostDto> getPostsByCategory(Integer categoryId);

	// get all posts by User
	List<PostDto> getPostsByUser(Integer userId);

	// search posts
	List<PostDto> searchPosts(String keyword);
}
