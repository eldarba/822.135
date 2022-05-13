package app.core.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

	List<Book> findAllByLibraryId(int libraryId);
}
