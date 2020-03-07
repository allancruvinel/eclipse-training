package application;

import java.util.Scanner;

import util.Conta;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta a;
		
		System.out.print("Enter account number ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder ");
		sc.nextLine();
		
		String titular = sc.nextLine();
		System.out.print("Is there a initial deposit? (y/n)");
		
		String init = sc.next();
		System.out.println(init);
		
		
		if(init.equals("y")) { 
			System.out.print("Enter initial deposit value ");
			double deposito = sc.nextDouble();
			a = new Conta(number,titular, deposito);
			
		}
		else {
			a= new Conta(number,titular);
		}
		System.out.println(a);
		
		System.out.print("Enter a deposit value ");
		a.depositar(sc.nextDouble());
		
		System.out.println(a.toString());
		System.out.print("Enter a withdraw value ");
		
		a.sacar(sc.nextDouble());
		System.out.println(a.toString());
		
		sc.close();
	}

}
