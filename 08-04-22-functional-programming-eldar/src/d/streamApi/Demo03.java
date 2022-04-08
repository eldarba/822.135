package d.streamApi;

import java.util.ArrayList;
import java.util.List;

public class Demo03 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("bananna");
		list.add("orange");
		list.add("Avocado");

		// count how many elements starts with the letter a
		long startsWithA = list.stream().map(e -> e.toLowerCase()).filter(e -> e.startsWith("a")).count();

		System.out.println(startsWithA);

		System.out.println(list);
	}

}
