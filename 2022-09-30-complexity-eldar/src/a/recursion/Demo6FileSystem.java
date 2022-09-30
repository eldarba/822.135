package a.recursion;

import java.io.File;

public class Demo6FileSystem {

	// methods you can use

	// file.isDirectory(); // check if current file is a directory
	// file.isFile(); // check if current file is a file
	// file[] filesAndDirs = file.listFiles(); // get the content of a directory
	// String path = file.getPath(); // get the file path as String

	/**
	 * print all directories, sub directories and the files content
	 * 
	 * @param path
	 */
	public static void printFS(String path) {
		// 0. create a file object from the path
		File file = new File(path);
		// 1. check for base case: if this is a file - print it
		if(file.isFile()) {
			System.out.println("\t" + file);
		}else {
			//2. if file is not a file then it must be a directory
			System.out.println(file);
			File[] files = file.listFiles();
			// 3. send each file in the array back to this method (recursion)
			for (File currFile : files) {
				printFS(currFile.getPath());
			}
			System.out.println("========");
		}
	}

	public static void main(String[] args) {
		printFS("c:/temp");
	}

}
