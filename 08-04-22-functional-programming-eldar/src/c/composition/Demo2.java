package c.composition;

import java.util.function.Predicate;

public class Demo2 {

	public static void main(String[] args) {

		// functional composition using the functional interfaces default methods
		String str = "the subject is functional programming.";
		System.out.println(str);

		Predicate<String> startsWithT = s -> s.startsWith("t");
		Predicate<String> endsWithG = s -> s.endsWith("g");
		// compose the 2 predicates above
		Predicate<String> startsWithTAndEndsWithG = s -> startsWithT.and(endsWithG).test(s);

		System.out.println(startsWithT.test(str));
		System.out.println(endsWithG.test(str));
		System.out.println(startsWithTAndEndsWithG.test(str));

		System.out.println("====================");
		System.out.println(startsWithT.or(endsWithG).test("tg"));
		System.out.println(startsWithT.or(endsWithG).test("tf"));
		System.out.println(startsWithT.or(endsWithG).test("fg"));
		System.out.println(startsWithT.or(endsWithG).test("aa"));

	}

}
