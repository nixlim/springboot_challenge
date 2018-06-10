package com.makersacademy.chitter_challenge.repository;

import com.makersacademy.chitter_challenge.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
