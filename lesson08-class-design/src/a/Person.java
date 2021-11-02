package a;

public class Person {

	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// create 2 Person instances
		Person p1 = new Person(101, "Dan", 25);
		Person p2 = new Person(101, "Rina", 23);
		// print them (using toString)
		System.out.println(p1);
		System.out.println(p2);
		// check if they represent the same person
		System.out.println(p1.equals(p2));
	}

}
