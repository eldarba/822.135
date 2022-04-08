package d.streamApi;

import java.util.Arrays;
import java.util.List;

public class Demo09NonMatch {

	public static void main(String[] args) {

		List<Integer> ages = Arrays.asList(25, 32, 53, 80, 7, 19, 22);

		// find if all ages are 18 and up
		boolean noMinor = ages.stream().noneMatch(age -> age < 18);
		System.out.println("no minors? " + noMinor);

	}

}
