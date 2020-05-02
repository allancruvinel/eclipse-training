package application;

import java.util.Scanner;

import entities.Account;
import exceptions.DomainException;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("enter with account number");
			int number = sc.nextInt();
			System.out.println("enter with account holder");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.println("enter with the initial balance");
			double balance = sc.nextDouble();
			sc.nextLine();
			System.out.println("enter with withdraw Limit");
			double withdrawLimit = sc.nextDouble();
			sc.nextLine();
			
			Account account = new Account(number,holder,balance,withdrawLimit);
			
			System.out.println("enter with withdraw");
			account.withdraw(sc.nextDouble());
			System.out.println(account.actualBalance());
		}
		catch(DomainException e) {
			System.out.println("erro "+e.getMessage());
		}
		catch(RuntimeException joao) {
			System.out.print("erro entrada de dados inválida");
		}
	}

}
