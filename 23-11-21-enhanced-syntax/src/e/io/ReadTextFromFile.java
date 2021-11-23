package e.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFromFile {

	public static void main(String[] args) {

		File file = new File("c:/eldar/temp/letter.txt");

		try (FileReader in = new FileReader(file);) {

			int ch = in.read(); // read the first character

			while (ch != -1) {
				System.out.print((char) ch);
				ch = in.read(); // read the next character
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
