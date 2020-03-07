package exerPOO3;

import java.util.Scanner;

import resourses.Student;

public class application {

	public static void main(String[] args) {
		Student x = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter with Student name and the 3 Scores");
		x.nome= sc.nextLine();
		x.n1 = sc.nextDouble();
		x.n2 = sc.nextDouble();
		x.n3 = sc.nextDouble();
		System.out.println(x.finalScore());
		sc.close();
	}

}
