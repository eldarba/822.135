package d.objects;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CatDeserializer {

	public static void main(String[] args) {

		try (ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(new File("files/cat.obj"))));) {

			Cat cat = (Cat) in.readObject();
			System.out.println(cat);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
