package targil;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStatistics {

	public static double averageSalary(List<? extends Employee> emps) {
		double sum = 0;
		for (Employee emp : emps) {
			sum += emp.getSalary();
		}
		double avg = sum / emps.size();
		return avg;
	}

	public static int numOfEmployees(List<? extends Employee> emps) {
		return emps.size();
	}

	public static int numOfEmployees(List<? extends Employee> emps, String department) {
		int c = 0;
		for (Employee emp : emps) {
			if (emp.getDepartment().equals(department)) {
				c++;
			}
		}
		return c;
	}

	public static void print(List<? extends Employee> emps) {
		System.out.println("==== Employees =============");
		for (Employee employee : emps) {
			System.out.println(employee);
		}
		System.out.println("==== ========= =============");
	}

	// random data
	public static List<Employee> getRandomEmps(int size) {
		List<Employee> emps = new ArrayList<Employee>();
		for (int i = 0; i < size; i++) {
			String name = names[(int) (Math.random() * names.length)];
			double salary = (int) (Math.random() * 20_000);
			String department = departments[(int) (Math.random() * departments.length)];
			if (Math.random() < 0.8) {
				emps.add(new Employee(name, salary, department));
			} else {
				emps.add(new Manager(name, salary, department));
			}
		}
		return emps;
	}

	public static List<Manager> getRandomMgrs(int size) {
		List<Manager> emps = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			String name = names[(int) (Math.random() * names.length)];
			double salary = (int) (Math.random() * 60_000);
			String department = departments[(int) (Math.random() * departments.length)];
			emps.add(new Manager(name, salary, department));
		}
		return emps;
	}

	public static String[] names = { "Dan", "Danna", "Rina", "Yosi", "Moshe" };
	public static String[] departments = { "Legal", "Sales", "Technical", "Promotion" };

}
