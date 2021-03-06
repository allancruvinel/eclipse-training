package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many employees will be registered ?");
		int n = sc.nextInt();
		List<Employee> employ = new ArrayList<>();
		for(int i=0;i<n;i++) {
			Employee e;
			System.out.println("Employee "+i+".");
			System.out.println("ID");
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double salary = sc.nextDouble();
			sc.nextLine();
			employ.add(e = new Employee(id,name,salary));
		}
		
		System.out.println("Enter the employee ID that  will have salary increase: ");
		int id = sc.nextInt();
		sc.nextLine();
		if(employ.stream().filter(x->x.getId()==id).findFirst().orElse(null)==null) {
			System.out.println("This ID does not exists");
		}
		else {
			Employee o = employ.stream().filter(x->x.getId()==id).findFirst().orElse(null);
			System.out.println("please enter with the increase salary percentagem");
			Double percentage = sc.nextDouble();
			o.increaseSalary(percentage);
		}
			
		System.out.println("List of Employees");
		for(Employee e: employ) {
			System.out.println(e.getId()+", "+e.getName()+", "+e.getSalary());
		}
		
		
	}

}
