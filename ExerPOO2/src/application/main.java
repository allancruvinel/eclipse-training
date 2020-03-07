package application;

import java.util.Scanner;

import resourses.Employee;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee x = new Employee();
		System.out.printf("Please enter with name, Gross Salary and taxes ");
		x.name = sc.nextLine();
		x.grossSalary=sc.nextDouble();
		x.tax=sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f", x.name,x.netSalary());
		
		System.out.printf("which percentagem to increase salary? ");
		x.increaseSalary(sc.nextDouble());
		System.out.printf("Updated Data: %s, $ %.2f", x.name,x.grossSalary);
		
		sc.close();
	}

}
