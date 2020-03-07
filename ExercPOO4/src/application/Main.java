package application;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("what is dolar price? ");
		double dolarPrice = sc.nextDouble();
		System.out.print("/nhow many dolars will be bought? ");
		double qtDolar = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f",CurrencyConverter.realConverter(dolarPrice, qtDolar));;
		sc.close();
	}

}
