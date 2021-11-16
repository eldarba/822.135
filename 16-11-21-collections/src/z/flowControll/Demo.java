package z.flowControll;

public class Demo {

	public static void main(String[] args) {

		String str1 = "aaa";
		String str2 = "aaa"; // string pool
		String str3 = new String("aaa");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);

		// check equality with equals method on objects
		System.out.println(str1.equals(str3));

	}

}
