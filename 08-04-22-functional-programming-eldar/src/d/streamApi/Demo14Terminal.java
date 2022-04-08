package d.streamApi;

import java.util.Arrays;
import java.util.List;

public class Demo14Terminal {

	public static void main(String[] args) {

		List<Integer> ages = Arrays.asList(25, 32, 53, 80, 7, 19, 22);
		System.out.println(ages);

		int sum = ages.stream().reduce((e, acumulator) -> acumulator + e).orElse(-1);
		System.out.println("sum is: " + sum);

		// ===========================
		List<String> list = Arrays.asList("welcome", "to", "functional", "programming");
		String msg = list.stream().reduce((e, message) -> e.concat(" " + message)).orElse("ERROR");
		System.out.println(msg);

	}

}
