package utils;

public class OrderItem {
	private int quantity;	
	private Product product;
	
	public OrderItem(int quantity, Product product) {
		this.quantity = quantity;
		this.product=product;
	}
	
	public Double subTotal() {
		
		return product.getPrice()*quantity ;
	}

	public int getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}
	
	
}
