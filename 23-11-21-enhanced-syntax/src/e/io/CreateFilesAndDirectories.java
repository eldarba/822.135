package e.io;

import java.io.File;
import java.io.IOException;

public class CreateFilesAndDirectories {

	public static void main(String[] args) throws IOException {
		// how to create files and directories
		File dir = new File("c:/eldar/temp");
		File file = new File(dir, "letter.txt");

		if (dir.exists()) {
			System.out.println("directory " + dir + " exist");
			if (file.exists()) {
				System.out.println("file " + file + " exist");
			} else {
				System.out.println("file " + file + " NOT exist");
				System.out.println("creating file " + file);
				file.createNewFile();
			}
		} else {
			System.out.println("directory " + dir + " NOT exist");
			System.out.println("creating directory " + dir);
			dir.mkdirs();
		}

	}

}
