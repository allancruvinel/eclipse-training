package main;

import java.util.Scanner;

import items.Product;

public class main {

	public static void main(String[] args) {
		Product x;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter with name, value and quantity of the product");
		String Name = sc.next();
		double Price = sc.nextDouble();
		int quantity = sc.nextInt();
		
		x = new Product(Name,Price,quantity);
		
		System.out.println(x.toString());
		System.out.println("Enter with the Quantity of the added produtcs");
		x.AddProducts(sc.nextInt());
		System.out.println(x.toString());
		System.out.println("Enter with the Quantity of the removed produtcs");
		x.RemoverProduct((sc.nextInt()));
		System.out.println(x.toString());
		
		sc.close();
		

	}

}
