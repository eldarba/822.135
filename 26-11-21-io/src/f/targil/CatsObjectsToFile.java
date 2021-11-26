package f.targil;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import d.objects.Cat;

public class CatsObjectsToFile {

	public static void main(String[] args) {
		File file = new File("files/cats.list");
		List<Cat> cats = new ArrayList<>();
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));) {
			for (int i = 0; i < 25; i++) {
				Cat cat = getRandomCat();
				cat.setId(i + 100);
				cats.add(cat);
			}
			// write the full list of cats to file
			out.writeObject(cats);
			System.out.println("cats written to " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Cat getRandomCat() {
		String[] names = { "mizi", "vova", "toolik", "yosef" };
		Cat cat = new Cat();
		cat.setColor(Color.values()[(int) (Math.random() * Color.values().length)].toString());
		cat.setName(names[(int) (Math.random() * names.length)]);
		cat.setWeight((int) (Math.random() * 11) + 5);
		return cat;
	}

	public enum Color {
		BLACK, WHITE, BROWN, GRAY;
	}

}
