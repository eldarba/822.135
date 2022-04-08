package d.streamApi;

import java.util.Arrays;
import java.util.List;

public class Demo12Terminal {

	public static void main(String[] args) {

		List<Integer> ages = Arrays.asList(25, 32, 53, 80, 7, 19, 22);

//		{
//			int x = ages.stream().findFirst().orElseThrow();
//			System.out.println(x);
//		}

//		{
//			int x = ages.stream().filter(e -> e > 100).findFirst().orElseThrow();
//			System.out.println(x);
//		}

//		{
//			int x = ages.stream().filter(e -> e > 100).findFirst().orElse(-1);
//			System.out.println(x);
//		}

		{
			int x = ages.stream().filter(e -> e > 100).findFirst().orElseThrow(() -> new MyException("stream empty"));
			System.out.println(x);
		}

	}

	static class MyException extends RuntimeException {

		public MyException(String message) {
			super(message);
		}

	}

}
