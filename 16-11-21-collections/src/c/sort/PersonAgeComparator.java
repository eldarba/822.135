package c.sort;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		// sometimes this is bad practice due to danger of overflow
		return p1.getAge() - p2.getAge();
	}

}
