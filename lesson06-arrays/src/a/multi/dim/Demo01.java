package a.multi.dim;

import java.util.Iterator;

public class Demo01 {

	public static void main(String[] args) {
		
		int[][] matrix = new int[3][10];
		
		matrix[2][4] = 100;
		
		
		System.out.println("length of 1st dim: " + matrix.length);
		System.out.println("length of 2nd dim: " + matrix[0].length);
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random()*11);
				System.out.print(matrix[i][j] + ",");
			}
			System.out.println();
		}
		
		
		
		

	}

}
