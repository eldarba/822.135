package c;

public class VampirePerson extends Person {

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {

		Person p1 = new Person();
		VampirePerson p2 = new VampirePerson();

		p2.setAge(22);
	}

}
