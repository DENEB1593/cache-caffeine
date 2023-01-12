package io.studey.deneb.controller;

import io.studey.deneb.model.Post;
import io.studey.deneb.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/posts")
public class PostController {

  private final static Logger log = LoggerFactory.getLogger(PostController.class);
  private final PostService postService;

  public PostController(PostService postService) {
    this.postService = postService;
  }

/*
  ns         %     Task name
---------------------------------------------
  1380118166  100%  post - findAll()
  000576875  100%  post - findAll()
*/
  @GetMapping
  public List<Post> findAll() {
    StopWatch stopWatch = new StopWatch();
    stopWatch.start("post - findAll()");
    List<Post> posts = postService.findAll();
    stopWatch.stop();
    log.info("{}", stopWatch.prettyPrint());
    return posts;
  }

}
