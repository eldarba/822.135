package b;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1Buffer {

	public static void main(String[] args) {

		File file = new File("letter.txt");

		try (BufferedWriter out = new BufferedWriter(new FileWriter(file));) {
			out.write("this is my text to the file.");
			System.out.println("end");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
