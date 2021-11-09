package c;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1);

		try {
			Person p2 = new Person(101, "aaa", 118);
			System.out.println(p2);
			p2.setAge(p2.getAge() + 1);
			System.out.println(p2);
			p2.setAge(p2.getAge() + 1);
			System.out.println(p2);
			p2.setAge(p2.getAge() + 1);
			System.out.println(p2);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
