package d.streamApi;

import java.util.Arrays;
import java.util.List;

public class Demo08AllMatch {

	public static void main(String[] args) {

		List<Integer> ages = Arrays.asList(25, 32, 53, 80, 7, 19, 22);

		// find if all ages are 18 and up
		boolean adults = ages.stream().allMatch(age -> age >= 18);
		System.out.println("all ages are adults? " + adults);

	}

}
