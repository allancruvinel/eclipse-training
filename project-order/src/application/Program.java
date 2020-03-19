package application;

import java.text.ParseException;
import java.util.Scanner;

import utils.Client;
import utils.Order;
import utils.OrderItem;
import utils.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Client client;
		OrderItem orderitem;
		Product product;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter client data:");
		System.out.printf("Name: "); String name = sc.nextLine();
		System.out.printf("Email: "); String email = sc.nextLine();
		System.out.printf("BirthDate (DD/MM/YYYY): "); String birthdate = sc.nextLine();
		client = new Client(name,email,birthdate);
		System.out.println("Enter Order Data:");
		
		System.out.printf("Status: "); String status = sc.nextLine();
		Order order = new Order(status,client);
		System.out.println("How many Itens to this order?: ");
		int x = sc.nextInt();
		sc.nextLine();
		
		for (int i=0;i<x;i++) {
			System.out.printf("Enter  %d item data: \n",i+1);
			System.out.printf("Product Name: ");String productName = sc.nextLine();
			System.out.printf("Product Price: ");double productPrice = sc.nextDouble();sc.nextLine();
			System.out.printf("quantity: ");int productQuantity = sc.nextInt();sc.nextLine();
			order.addItem(orderitem = new OrderItem(productQuantity,product = new Product(productName,productPrice)));
		}
		
		System.out.println(order.toString());

	}

}
