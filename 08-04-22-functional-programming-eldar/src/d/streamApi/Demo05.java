package d.streamApi;

import java.util.ArrayList;
import java.util.List;

public class Demo05 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("two");
		list.add("one");
		list.add("three");
		list.add("two");
		list.add("one");

		long distinctElements = list.stream()

				.peek(e -> System.out.println(e))

				.distinct()

				.count();

		System.out.println("distinct elements: " + distinctElements);

	}

}
