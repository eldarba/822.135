package b.theFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Demo2Predicate {

	public static void main(String[] args) {

		Predicate<Integer> inRange = x -> x >= 0 && x <= 100;

		System.out.println(inRange.test(5));
		System.out.println(inRange.test(3));
		System.out.println(inRange.test(500));
		System.out.println(inRange.test(5));
		System.out.println(inRange.test(350));

		System.out.println("===============");

		Predicate<List<String>> containsHello = list -> list.contains("hello");
		List<String> list = Arrays.asList("aaa", "hello", "ccc");
		System.out.println(containsHello.test(list));

	}

}
