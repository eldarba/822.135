package b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tar1 {

	public static void main(String[] args) {
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 11));
			sum += list.get(i);
		}
		System.out.println(list);
		System.out.println("sum: " + sum);

		// remove all odd elements and print the list

		Iterator<Integer> it = list.iterator();
		// next - get the next element
		// hasNext - is there a next element
		// remove - remove the current element

//		int x;
//		x = it.next();
//		System.out.println("first element: " + x);
//		x = it.next();
//		System.out.println("next element: " + x);
//		x = it.next();
//		System.out.println("next element: " + x);

		while (it.hasNext()) {
			int x = it.next();
			if (x % 2 != 0) {
				it.remove();
			}
		}

		System.out.println(list);

	}

}
