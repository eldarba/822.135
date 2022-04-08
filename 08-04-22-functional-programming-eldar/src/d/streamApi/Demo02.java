package d.streamApi;

import java.util.ArrayList;
import java.util.List;

public class Demo02 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");

		list.stream().map(e -> e.toUpperCase()).forEach(e -> System.out.println(e));
	}

}
