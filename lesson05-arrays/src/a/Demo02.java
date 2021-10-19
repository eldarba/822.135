package a;

public class Demo02 {

	public static void main(String[] args) {
		// create an array of int
		int[] arr = new int[10];

		// populate the array with random numbers
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
		}
		
		// iterate over the array elements and print each element
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}

	}

}
