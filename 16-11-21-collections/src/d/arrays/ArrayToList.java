package d.arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {

		Integer[] arr = { 3, 5, 9, 1, 4 };
		System.out.println(Arrays.toString(arr));

		// convert the array to list
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list);

	}

}
