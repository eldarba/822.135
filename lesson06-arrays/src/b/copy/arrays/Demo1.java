package b.copy.arrays;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6 };
		System.out.println(Arrays.toString(arr));

		int[] arrTemp = new int[arr.length + 5];
		System.out.println(Arrays.toString(arrTemp));

		// copy elements from source array to destination array
		System.arraycopy(arr, 0, arrTemp, 0, arr.length);
		System.out.println(Arrays.toString(arrTemp));

		System.arraycopy(arr, 1, arrTemp, 3, arr.length - 1);
		System.out.println(Arrays.toString(arrTemp));

	}

}
