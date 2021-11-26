package e.append;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextToFile {

	public static void main(String[] args) {

		File file = new File("files/file1.txt");
		boolean append = true;

		// with append as true - we add text to the file (old content remains)
		// with append as false - we delete old content and add new text to the file

		try (BufferedWriter out = new BufferedWriter(new FileWriter(file, append));) {
			out.write("this is line 1");
			out.newLine();
			out.write("this is line 2");
			out.newLine();
			out.write("this is line 3");
			out.newLine();

			System.out.println("text written to: " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
