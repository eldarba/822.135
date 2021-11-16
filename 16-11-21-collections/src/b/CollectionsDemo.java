package b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsDemo {

	public static void main(String[] args) {

		// LIST
		List<String> list1 = new ArrayList<>(); // random access
		List<String> list2 = new LinkedList<>(); // add / remove
		list1.add("Math");
		list1.add("Math");
		list1.add("English");
		list1.add("Java");
		list1.add("Java");
		list1.add("History");
		list1.add("Algebra");
		System.out.println(list1); // the list
		System.out.println(list1.get(2)); // an element of the list
		System.out.println(list1.size()); // the number of elements
		System.out.println("==================");
		// SET
		Set<String> set = new HashSet<>();
		set.add("Math");
		set.add("Math");
		set.add("English");
		set.add("Java");
		set.add("Java");
		set.add("History");
		set.add("Algebra");
		System.out.println(set); // the list
		System.out.println(set.size()); // the number of elements

		System.out.println("==================");
		// create a collection from another collection
		Set<String> set1 = new HashSet<>(list1); // hash ordered
		Set<String> set2 = new LinkedHashSet<>(list1); // insert order
		Set<String> set3 = new TreeSet<>(list1); // sorted by natural order
		System.out.println(set1); // the list
		System.out.println(set2); // the list
		System.out.println(set3); // the list

		System.out.println("==================");
		// MAP
		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("dog", "a nice animal that barks");
		dictionary.put("java", "an oop programming language");
		dictionary.put("table", "a furniture to put things on");

		Scanner sc = new Scanner(System.in);
		System.out.print("enter word: ");
		String key = sc.nextLine();
		sc.close();

		String definition = dictionary.get(key);
		System.out.println(definition);

	}

}
