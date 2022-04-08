package d.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo01 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");

		// get a stream on the above list
		Stream<String> stream = list.stream();

		// on a stream we can add listeners (intermediate operations)
		stream = stream.map(e -> e.toUpperCase());

		// on a stream we finally add a terminal operations
		stream.forEach(e -> System.out.println(e));

	}

}
