package b;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Tar2 {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		int c = 0;
		while (set.size() < 10) {
			set.add((int) (Math.random() * 11));
			c++;
		}
		System.out.println(set);
		System.out.println("iterations: " + c);

		int sum = 0;
		for (Integer x : set) {
			sum += x;
		}
		System.out.println("sum: " + sum);

		// remove all odd elements from the set
		Iterator<Integer> it = set.iterator();

		while (it.hasNext()) {
			int x = it.next();
			if (x % 2 != 0) {
				it.remove();
			}
		}

		System.out.println(set);
	}

}
