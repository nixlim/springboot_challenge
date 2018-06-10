package com.makersacademy.chitter_challenge;


import com.makersacademy.chitter_challenge.model.Post;
import com.makersacademy.chitter_challenge.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

  private final PostRepository repository;

  @Autowired
  public DatabaseLoader(PostRepository repository) {
  	this.repository = repository;
  }

  @Override
  public void run(String... strings) throws Exception {

  }
}
