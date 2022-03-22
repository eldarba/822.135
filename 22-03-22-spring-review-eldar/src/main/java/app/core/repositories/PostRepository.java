package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
