package app.core;

import java.time.LocalDate;

import app.core.data.Book;
import app.core.data.DataSource;
import app.core.data.SystemFacade;

public class App {

	public static void main(String[] args) {

		DataSource.getInstance();
		SystemFacade facade = new SystemFacade();
		Book book = new Book(0, "Java 1", "Eldar", LocalDate.of(2020, 5, 25), 580);
		facade.addBook(book);
		System.out.println("added: " + book);
		DataSource.getInstance().closeDatasource();
	}

}
