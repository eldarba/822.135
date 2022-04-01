package app.core.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
