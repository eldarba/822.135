package d.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class Demo15Arrays {

	public static void main(String[] args) {

		List<Integer> ages = Arrays.asList(25, 32, 53, 80, 7, 19, 22);
		System.out.println(ages);

		// an array of object
		Object[] arr = ages.stream().filter(e -> e > 30).toArray();
		System.out.println(Arrays.toString(arr));

		// an array of specified
		IntFunction<Integer[]> intFunction = size -> new Integer[size];
		Integer[] arr2 = ages.stream().filter(e -> e > 30).toArray(intFunction);
		System.out.println(Arrays.toString(arr2));

		// an array of specified
		Integer[] arr3 = ages.stream().filter(e -> e > 30).toArray(size -> new Integer[size]);
		System.out.println(Arrays.toString(arr3));

		// get a stream from varargs
		Stream.of(2, 4, 6, 8).forEach(System.out::println);

	}

}
