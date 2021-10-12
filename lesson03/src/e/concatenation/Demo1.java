package e.concatenation;

public class Demo1 {

	public static void main(String[] args) {

		String str = "there are ";
		int students = 5;
		String str2 = " students in the classroom";
		
		System.out.print(str);
		System.out.print(students);
		System.out.println(str2);
		
		System.out.println(str + students + str2);
		
		int a = 5;
		int b = 6;
		int sum = a+b;
		
		System.out.println(a + " + " + b + " = " + sum);

	}

}
