package d.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo11Terminal {

	public static void main(String[] args) {

		List<Integer> ages = Arrays.asList(25, 32, 53, 80, 7, 19, 22);

		// find any element
		Optional<Integer> opt;

		opt = ages.stream().findAny();
		if (opt.isPresent()) {
			int x = opt.get();
			System.out.println(x);
		} else {
			System.out.println("not found");
		}
	}

}
