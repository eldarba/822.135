package a;

public class Demo01 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		arr[0] = 7;
		arr[1] = 3;
		arr[2] = (int) (Math.random()*101);
		arr[3] = (int) (Math.random()*101);
		arr[4] = (int) (Math.random()*101);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

	}

}
