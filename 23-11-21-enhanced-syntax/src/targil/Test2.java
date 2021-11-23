package targil;

import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		// get a list of random employees
		List<Manager> emps = EmployeeStatistics.getRandomMgrs(10);
		// print all employees
		EmployeeStatistics.print(emps);
		// number of employees
		System.out.println("number of employees: " + EmployeeStatistics.numOfEmployees(emps));
		// number of employees in department
		String department = EmployeeStatistics.departments[(int) (Math.random()
				* EmployeeStatistics.departments.length)];
		System.out.print("number of employees in " + department + " department: ");
		System.out.println(EmployeeStatistics.numOfEmployees(emps, department));
		// average salary
		System.out.println("Average Salary: " + EmployeeStatistics.averageSalary(emps));

	}

}
