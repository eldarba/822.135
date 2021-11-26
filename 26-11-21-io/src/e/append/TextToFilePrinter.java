package e.append;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import d.objects.Cat;

public class TextToFilePrinter {

	public static void main(String[] args) {

		File file = new File("files/file1.txt");
		boolean append = false;

		// with append as true - we add text to the file (old content remains)
		// with append as false - we delete old content and add new text to the file

		try (PrintWriter out = new PrintWriter(new FileWriter(file, append));) {
			out.println("this is line 1");
			out.println(5);
			out.println(LocalDate.now());
			out.println(new Cat(101, "Yosef", 22, "Mustard"));

			out.println("=== prices======");
			for (int i = 0; i < 10; i++) {
				double price = Math.random() * 101;
				out.println(String.format("price: %10.2f", price));
			}

			System.out.println("text written to: " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
