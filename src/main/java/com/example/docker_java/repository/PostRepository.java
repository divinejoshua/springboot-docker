package com.example.docker_java.repository;
import com.example.docker_java.model.Post;
import org.springframework.data.repository.ListCrudRepository;
public interface PostRepository extends ListCrudRepository<Post,Integer> {
}