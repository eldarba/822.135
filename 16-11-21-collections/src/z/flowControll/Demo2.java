package z.flowControll;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}

		System.out.println(Arrays.toString(arr));

		for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
		}
		System.out.println(Arrays.toString(arr));

	}

}
