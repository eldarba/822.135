package b.flow.control;

public class Demo03IfElseIf {

	public static void main(String[] args) {

		int grade = (int) (Math.random() * 151);
		System.out.println("the grade is: " + grade);
		
		if(grade <= 55) {
			System.out.println("fail");
		}else if(grade < 70) {
			System.out.println("pass");
		}else if(grade < 85) {
			System.out.println("good");
		}else if(grade <= 100) {
			System.out.println("Excelent");
		}else { // else block is optional
			System.out.println("this is odd - above 100?");
		}

	}

}
