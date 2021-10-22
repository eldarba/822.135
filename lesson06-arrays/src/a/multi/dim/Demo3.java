package a.multi.dim;

public class Demo3 {

	public static void main(String[] args) {

		// matrix - all inner arrays are of same length
		int[][] matrix = new int[5][3];

		// 2D array - inner arrays may be of different length
		int[][] arr = new int[5][];
		arr[0] = new int[10];
		arr[1] = new int[3];
		arr[2] = new int[5];
		arr[3] = new int[7];
		arr[4] = new int[15];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		

	}

}
