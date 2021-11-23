package e.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextToFile {

	public static void main(String[] args) {

		File file = new File("c:/eldar/temp/letter.txt");

		try (FileWriter out = new FileWriter(file);) {
			out.write("Hello Java IO");
			System.out.println("text was writen to " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
