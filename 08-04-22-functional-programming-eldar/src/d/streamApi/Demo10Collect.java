package d.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo10Collect {

	public static void main(String[] args) {

		// create a list
		List<String> list = Arrays.asList("aaa", "bbb", "ccc", "bBb");
		// collect elements to a new list
		List<String> listUppres = list.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
		// collect elements to a set
		Set<String> setUppres = list.stream().map(e -> e.toUpperCase()).collect(Collectors.toSet());

		System.out.println(list);
		System.out.println(listUppres);
		System.out.println(setUppres);

		// collect all unique elements to a new list
		List<String> listUppresUnnique = list.stream().map(e -> e.toUpperCase()).distinct()
				.collect(Collectors.toList());
		System.out.println(listUppresUnnique);

		System.out.println("\n=== create a list of all even numbers");
		List<Integer> numbers = Arrays.asList(2, 5, 66, 13, 45, 67, 88, 90);
		System.out.println(numbers);

		numbers = numbers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		System.out.println(numbers);
	}

}
