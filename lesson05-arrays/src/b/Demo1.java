package b;

import a.Point;

public class Demo1 {

	public static void main(String[] args) {
		int[] arr1 = new int[5];
		// dynamic initialization of an array
		arr1[0] = 4;
		arr1[1] = 7;
		arr1[2] = 2;
		arr1[3] = 1;
		arr1[4] = 9;

		// static initialization of an array
		int[] arr2 = { 2, 4, 6, 8 };
		String[] arr3 = {"aaa", "bbb", "ccc"};
		Point[] points = {new Point(2,  5), new Point(10, 10)}; 

	}

}
