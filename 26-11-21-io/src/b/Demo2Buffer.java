package b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo2Buffer {

	public static void main(String[] args) {

		File file = new File("letter.txt");

		try (BufferedReader in = new BufferedReader(new FileReader(file));) {
			String line = in.readLine();
			while (line != null) {
				System.out.println(line);
				line = in.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
