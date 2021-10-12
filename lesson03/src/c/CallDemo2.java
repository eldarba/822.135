package c;

import b.Person;

public class CallDemo2 {
	
	public static void main(String[] args) {
		m1(); // call m1
	}
	
	public static void m1() {
		Person p = new Person(111, "aaa", 10);
		System.out.println(p.getName());
		m2(p);  // java implements call by value (rather call by reference)
		System.out.println(p); // an object is printed
		System.out.println(p.getName()); // bbb
	}
	
	public static void m2(Person p) {
		System.out.println(p);
		p.setName("bbb");
		p = null;
		
		System.out.println(p); 
	}

}
