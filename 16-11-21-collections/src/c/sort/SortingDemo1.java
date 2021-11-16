package c.sort;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SortingDemo1 {

	public static void main(String[] args) {

		{
			List<Integer> list = new ArrayList<>();
			list.add(5);
			list.add(3);
			list.add(7);
			list.add(5);
			list.add(9);
			System.out.println(list);
			list.sort(null); // null = means sort by natural order
			System.out.println(list);
		}

		System.out.println("============");

		{
			List<String> list = new ArrayList<>();
			list.add("hello");
			list.add("bye");
			list.add("table");
			list.add("car");
			list.add("person");
			System.out.println(list);
			list.sort(null);
			System.out.println(list);
		}
		System.out.println("============");

		{
			List<LocalDate> list = new ArrayList<>();
			list.add(LocalDate.of(2020, 5, 25));
			list.add(LocalDate.of(2000, 5, 25));
			list.add(LocalDate.of(2022, 5, 25));
			list.add(LocalDate.of(1980, 5, 25));
			System.out.println(list);
			list.sort(null);
			System.out.println(list);
		}
		System.out.println("============");

		{
			List<Person> list = new ArrayList<>();
			list.add(new Person(200, "ccc", 40));
			list.add(new Person(101, "bbb", 25));
			list.add(new Person(307, "aaa", 30));

			System.out.println("insert order");
			System.out.println(list);

			System.out.println("natural order");
			list.sort(null);
			print(list);

			System.out.println("name order");
			list.sort(new PersonNameComparator());
			print(list);

			System.out.println("age order");
			list.sort(new PersonAgeComparator());
			print(list);
		}

		{
			String s1 = "ccc";
			String s2 = "ccc";

			System.out.println(s1.compareTo(s2));
		}

	}

	static void print(Collection<?> collection) {
		System.out.println("================");
		for (Object e : collection) {
			System.out.println(e);
		}
		System.out.println("================");
	}

}
