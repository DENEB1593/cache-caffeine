package io.studey.deneb;

import io.studey.deneb.model.Post;
import io.studey.deneb.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import java.util.stream.IntStream;

@EnableCaching
@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  public CommandLineRunner commandLineRunner(PostRepository postRepository) {
    return args -> {
      IntStream.rangeClosed(1, 500_000).forEach(num -> {
       postRepository.save(new Post("name" + num, "content" + num));
      });

    };
  }

}
