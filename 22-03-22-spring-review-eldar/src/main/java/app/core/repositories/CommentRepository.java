package app.core.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

	List<Comment> findByPostId(int postId);

}
