package app.core.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Check;

import lombok.Data;

@Data
@Entity
@Table(name = "books")
@Check(constraints = "price >= 0")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "book_title")
	private String title;
	@Column(nullable = false)
	private String author;
	private LocalDate publicationDate;
	private double price;
}
