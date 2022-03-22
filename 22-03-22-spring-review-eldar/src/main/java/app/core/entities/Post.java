package app.core.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString(exclude = "comments")
@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String owner;
	private LocalDate issueDate;
	private String text;

	@OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
	private List<Comment> comments;

	public void addComment(Comment comment) {
		if (this.comments == null) {
			this.comments = new ArrayList<>();
		}
		comment.setPost(this);
		this.comments.add(comment);
	}

	public void setComments(List<Comment> comments) {
		for (Comment comment : comments) {
			comment.setPost(this);
		}
		this.comments = comments;
	}

}
