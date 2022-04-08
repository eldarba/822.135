package b.theFunctionalInterfaces;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.function.Consumer;

import types.Point;

public class Demo6Consumer {

	public static void main(String[] args) {

		// example 1 - print an integer
		Consumer<Integer> printInt = x -> System.out.println(x);

		printInt.accept(8);

		// example 2 - print any type
		Consumer<Object> print = x -> System.out.println(x);
		print.accept("aaa");
		print.accept(new Point());

		// example 3 - save to file
		Consumer<Serializable> saveToFile = (obj) -> {
			File file = new File("file.obj");
			try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));) {
				out.writeObject(obj);
			} catch (IOException e) {
				e.printStackTrace();
			}
		};

		Point p = new Point(6, 8);
		saveToFile.accept(p);
		System.out.println("saved");
	}

}
