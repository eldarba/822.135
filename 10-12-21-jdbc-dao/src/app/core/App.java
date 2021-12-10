package app.core;

import app.core.data.Book;
import app.core.data.DataSource;
import app.core.data.SystemFacade;

public class App {

	public static void main(String[] args) {

		DataSource.getInstance();
		System.out.println("Book System up");
		SystemFacade facade = new SystemFacade();

		try {
			{// create
//			Book book = new Book(0, "Java 1", "Eldar", LocalDate.of(2020, 5, 25), 580);
//			facade.addBook(book);
//			System.out.println("added: " + book);
			}

			{// read
				Book book = facade.getBook(155);
				System.out.println(book);
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
//			e.printStackTrace();
		}

		DataSource.getInstance().closeDatasource();
		System.out.println("Book System down");
	}

}
