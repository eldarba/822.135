package d.streamApi;

import java.util.Arrays;
import java.util.List;

public class Demo13Terminal {

	public static void main(String[] args) {

		List<Integer> ages = Arrays.asList(25, 32, 53, 80, 7, 19, 22);
		System.out.println(ages);

		// find maximum
		int max = ages.stream().max((a, b) -> a - b).orElseThrow();
		System.out.println("max is: " + max);

		// find minimum
		int min = ages.stream().min((a, b) -> a - b).orElseThrow();
		System.out.println("min is: " + min);

	}

}
