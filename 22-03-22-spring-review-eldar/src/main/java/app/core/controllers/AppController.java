package app.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.entities.Comment;
import app.core.entities.Post;
import app.core.services.AppService;

@RestController
@RequestMapping("/api")
public class AppController {

	@Autowired
	private AppService appService;

	@PostMapping
	public int addPost(@RequestBody Post post) {
		try {
			return this.appService.addPost(post);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}

	@PostMapping("/{postId}")
	public void addCommentToPost(@RequestBody Comment comment, @PathVariable int postId) {
		try {
			this.appService.addCommentToPost(comment, postId);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}

	@GetMapping
	public List<Post> getAllPost() {
		try {
			List<Post> posts = this.appService.getAllPosts();
			return posts;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}

	// http://localhost:8080/api/post/2
	@DeleteMapping("/post/{postId}")
	public void deletePost(@PathVariable int postId) {
		this.appService.deletePost(postId);
	}

	// http://localhost:8080/api/comment?commentId=2
	@DeleteMapping("/comment")
	public void deleteComment(@RequestParam int commentId) {
		this.appService.deleteComment(commentId);
	}

}
