package a.multi.dim;

import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {
// static initialization of array
		int[] arr = { 2, 4, 6 };
		System.out.println(Arrays.toString(arr));

		System.out.println("==================");

// static initialization of 2 dimensional array
		int[][] arrDim = { { 1, 2, 3 }, { 100, 200 }, { 33, 44, 77, 88, 88 } };

		for (int i = 0; i < arrDim.length; i++) {
			System.out.println(Arrays.toString(arrDim[i]));
		}

	}

}
