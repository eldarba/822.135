package b.theFunctionalInterfaces;

import java.util.function.Function;

public class Demo1AFunction {

	public static void main(String[] args) {

//		Function<String, Integer> getLength = (word) -> {
//			int length = word.length();
//			return length;
//		};

		Function<String, Integer> getLength = word -> word.length();
		int length1 = getLength.apply("aaaaa");
		System.out.println(length1);

		GetLenghth g = new GetLenghth();
		int length2 = g.apply("aaaaa");
		System.out.println(length2);

	}

	static class GetLenghth implements Function<String, Integer> {

		@Override
		public Integer apply(String word) {
			return word.length();
		}

	}

}
