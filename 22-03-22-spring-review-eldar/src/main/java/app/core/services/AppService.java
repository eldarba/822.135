package app.core.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.Comment;
import app.core.entities.Post;
import app.core.exceptions.PostSystemException;
import app.core.repositories.CommentRepository;
import app.core.repositories.PostRepository;

@Service
@Transactional
public class AppService {

	@Autowired
	private PostRepository postRepository;
	@Autowired
	private CommentRepository commentRepository;
	@Value("${post.length.title.min}")
	private int postTitleMinLength;
	@Value("${post.length.title.max}")
	private int postTitleMaxLength;

	public int addPost(Post post) throws PostSystemException {
		// check that this post is new
		if (post.getId() != 0 && this.postRepository.existsById(post.getId())) {
			throw new PostSystemException("addPost failed - post already exists");
		}
		// check that title length is of the right length
		if (post.getTitle().length() < this.postTitleMinLength) {
			throw new PostSystemException("addPost failed - title too short");
		}
		if (post.getTitle().length() > this.postTitleMaxLength) {
			throw new PostSystemException("addPost failed - title too long");
		}
		post = this.postRepository.save(post);
		return post.getId();
	}

	public void addCommentToPost(Comment comment) {
		Post post = comment.getPost();
		if (post == null) {
			throw new PostSystemException("addComment failed - post is null");
		} else {
			Optional<Post> opt = this.postRepository.findById(post.getId());
			if (opt.isEmpty()) {
				throw new PostSystemException("addComment failed - post not exist");
			} else {
				post = opt.get();
				post.addComment(comment);
			}
		}
	}

	public void addCommentToPost(Comment comment, int postId) {
		Optional<Post> opt = this.postRepository.findById(postId);
		if (opt.isEmpty()) {
			throw new PostSystemException("addComment failed - post not exist");
		} else {
			Post post = opt.get();
			post.addComment(comment);
		}
	}
}
