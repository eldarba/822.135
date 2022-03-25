package app.core.runners;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import app.core.entities.Comment;
import app.core.entities.Post;
import app.core.services.AppService;

// @Component
@Order(1)
public class Runner1 implements CommandLineRunner {

	@Autowired
	private AppService appService;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("========= runner 1");

		try {
			Post post = new Post();
			post.setTitle("The new Spring features");
			post.setOwner("Eldar");
			post.setIssueDate(LocalDate.now());
			post.setText("Very interesting features");
			post.addComment(new Comment(0, "aaa", LocalDateTime.now(), "great", null));
			post.addComment(new Comment(0, "bbb", LocalDateTime.now(), "poor", null));
			post.addComment(new Comment(0, "ccc", LocalDateTime.now(), "nice", null));
			int postId = appService.addPost(post);
			System.out.println("post added. id: " + postId);
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
//			e.printStackTrace();
		}
		System.out.println("==================");

	}

}
