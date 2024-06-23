package com.example.docker_java;

import com.example.docker_java.model.Post;
import com.example.docker_java.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DockerJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerJavaApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(PostRepository repository) {
		return args -> repository.save(new Post("Hello World!","My first blog post!"));
	}
}
