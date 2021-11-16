package d.arrays;

import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 5, 8, 2);
		System.out.println(list);

		// convert list to array
		Integer[] arr = list.toArray(new Integer[list.size()]);
		System.out.println(Arrays.toString(arr));
	}

}
