package c;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {

		Person[] persons = new Person[5];
		persons[0] = new Person();
		persons[1] = new Person();
		persons[4] = new Person();
		System.out.println(Arrays.toString(persons));
		System.out.println("======================");

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
				break;
			}
			System.out.println(persons[i]);
		}

		System.out.println("======================");
		System.out.println(Arrays.toString(persons));
	}

}
