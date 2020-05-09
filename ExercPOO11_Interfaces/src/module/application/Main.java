package module.application;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import module.entities.Contract;
import module.entities.Installment;
import module.services.PaypalFee;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Contract Data");
		System.out.println("Number");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Date");
		String date = sc.nextLine();
		System.out.println("Constract value");
		Double value = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter number of Installments");
		int Installments = sc.nextInt();
		sc.nextLine();
		
		Contract contract = new Contract(number,date,value,Installments,new PaypalFee());
		
		List<Installment> list = contract.monthsPreview();
		for (Installment i : list) {
			System.out.println("date "+i.getPaymentDate()+" value "+i.getPayValue());
		}
		
		

	}

}
