package f.targil;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import d.objects.Cat;

public class CatsObjectsFromFile {

	public static void main(String[] args) {

		File file = new File("files/cats.list");

		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));) {
			List<Cat> cats = (List) in.readObject();
			for (Cat cat : cats) {
				System.out.println(cat);
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
