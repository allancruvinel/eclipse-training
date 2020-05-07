package entities;

public class Product {
	private String name;
	private double value;
	private int quantity;
	
	public Product() {
		
	}
	public Product(String name, double value, int quantity) {
		this.name = name;
		this.value = value;
		this.quantity = quantity;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getTotal() {
		return value*quantity;
	}
}
