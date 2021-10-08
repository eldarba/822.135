package a;

public class App2 {

	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person(222, "Dina", 33);
		Person p3 = new Person();

		System.out.println(p2.getId());
		System.out.println(p2.getName());
		System.out.println(p2.getAge());

		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

		p1.setId(201);
		p1.setName("david");
		p1.setAge(23);

		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	}

}
