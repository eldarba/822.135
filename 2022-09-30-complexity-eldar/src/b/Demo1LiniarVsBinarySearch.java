package b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo1LiniarVsBinarySearch {

	public static int liniarSearch(int[] arr, int val) {
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			c++;
			if (arr[i] == val) {
				System.out.println(c + " itterations");
				return i;
			}
		}
		System.out.println(c + " itterations");
		return -1;
	}

	public static int binarySearch(int[] arr, int val) {
		int low = 0;
		int high = arr.length - 1;
		int c = 0;
		while (low < high) {
			c++;
			int mid = (low + high) / 2;
			int midVal = arr[mid];
			if (midVal < val) {
				low = mid + 1;
			} else if (midVal > val) {
				high = mid - 1;
			} else {
				System.out.println("itterations: " + c);
				return mid;
			}
		}
		System.out.println("itterations: " + c);
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 4, 1, 6, 8, 9, 3, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 4, 4, 4, 4, 4, 4, 4, 4 };
//		int index = liniarSearch(arr, 100);
		int index = binarySearch(arr, 100);
		System.out.println(index);

		List<Integer> list;
		
		list = new ArrayList<>(Arrays.asList(2, 4, 6, 1, 5, 3, 6, 8));
		System.out.println(list.get(100)); // random access - good performance
		list.remove(0); // poor performance
		list.add(0, 900); // poor performance

		list = new LinkedList<>(list);
		System.out.println(list.get(100)); // random access - poor performance
		list.remove(0); // good performance
		list.add(0, 900); // good performance
	}

}
