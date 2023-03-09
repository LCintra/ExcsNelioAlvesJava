package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered?");
		int employeeQnt = sc.nextInt();
		sc.nextLine();
		List<Employee> list = new ArrayList<>();
		
		for(int x = 0; x < employeeQnt; x++) {
			System.out.println("Employee #" + (x + 1));
			System.out.print("Id:");
			String id = sc.nextLine();
			System.out.print("Name:");
			String name = sc.nextLine();
			System.out.print("Salary:");
			Double salary = sc.nextDouble();
			sc.nextLine();
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
		}
		
		System.out.println("Enter the employee id that will have salary increase:");
		String idToIncrease = sc.nextLine();
		Employee employeeToIncrease = list.stream()
				.filter(x -> x.getId().equals(idToIncrease))
				.findFirst()
				.orElse(null);
		if (employeeToIncrease == null) {
			System.out.println("Don't exist employees with this ID");
		} else {
			System.out.println("Enter the porcentage:");
			double porcentageToIncrease = sc.nextDouble();
			employeeToIncrease.increaseSalary(porcentageToIncrease);
		}
		
		System.out.println("List of employees:");
		for(Employee x : list) {
			System.out.println(x);
		}

		sc.close();
	}

}
