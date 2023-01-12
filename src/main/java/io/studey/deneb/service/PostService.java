package io.studey.deneb.service;

import io.studey.deneb.model.Post;
import io.studey.deneb.repository.PostRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
  private final PostRepository postRepository;

  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Cacheable(cacheNames = "post_list")
  public List<Post> findAll() {
    return postRepository.findAll();
  }
}
