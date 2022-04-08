package d.streamApi;

import java.util.ArrayList;
import java.util.List;

public class Demo04 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("two");
		list.add("one");
		list.add("three");
		list.add("two");
		list.add("one");
		System.out.println(list);

		list.stream().distinct().forEach(e -> System.out.println(e));

	}

}
