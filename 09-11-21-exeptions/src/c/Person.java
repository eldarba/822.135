package c;

public class Person {

	public static final int MIN_AGE = 0;
	public static final int MAX_AGE = 120;

	private int id;
	private String name;
	protected int age;

	public Person() {
	}

	public Person(int id, String name, int age) throws Exception {
		super();
		this.id = id;
		this.name = name;
		setAge(age);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeException {
		if (age >= MIN_AGE && age <= MAX_AGE) {
			this.age = age;
		} else {
			throw new AgeException("the age " + age + " is out of range");
		}
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
