package c;

public class Test2 {

	public static void main(String[] args) {

		Person[] persons = new Person[5];
		persons[0] = new Person();
		persons[1] = new Person();
		persons[4] = new Person();

		for (int i = 0; i < persons.length; i++) {
			int age = (int) (Math.random() * 201);
			try {
				persons[i].setAge(age);
			} catch (NullPointerException e) {
				persons[i] = new Person();
				System.out.println("NULL");
			} catch (AgeException e) {
				System.out.println("illegal age: " + e.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(persons[i]);
		}

	}

}
