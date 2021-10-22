package homwork.ex7.tar3;

public class Tar3 {

	public static void main(String[] args) {
		
		int[] arr = getRandomArray(10, 0, 10);
		printArray(arr);
		arr = getUniqueArr(arr);
		printArray(arr);

	}

	/**
	 * get an array with possible duplicate elements and return a new array without duplicates
	 * @param arr
	 * @return
	 */
	private static int[] getUniqueArr(int[] arr) {
		int length = 0;
		int[] uniqueArr = new int[arr.length];
		lbl: for (int i = 0; i < arr.length; i++) {
			int candidate = arr[i];
			for (int j = 0; j < length; j++) {
				// check if candidate is unique
				if(candidate == uniqueArr[j]) {
					// if we are here candidate is not unique
					continue lbl;
				}
			}
			
			// if we are here - candidate is unique
			uniqueArr[length++] = candidate;
			
		}
		
		// can an array of the right length
		int[] shortArr = new int[length];
		// copy all elements
		System.arraycopy(uniqueArr, 0, shortArr, 0, length);
		return shortArr;
	}

	private static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length-1] + "]");
		
	}

	/**
	 * return an array of the specified length with elements at the specified range
	 * 
	 * @param length the length of the returned array
	 * @param min the minimum element value 
	 * @param max the maximum element value 
	 * @return
	 */
	private static int[] getRandomArray(int length, int min, int max) {

		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (max - min + 1)) + min;
		}

		return arr;
	}

}
