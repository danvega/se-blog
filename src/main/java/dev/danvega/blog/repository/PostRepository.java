package dev.danvega.blog.repository;

import dev.danvega.blog.model.Post;
import org.springframework.data.repository.ListCrudRepository;

public interface PostRepository extends ListCrudRepository<Post,Integer> {

}
