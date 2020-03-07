package items;

public class Product {
	public String Name;
	public Double Price;
	public int quantity;
	
	public Product(String Name,Double Price,int quantity) {
		this.Name = Name;
		this.Price = Price;
		this.quantity = quantity;
	}
	
	public double TotalValueInStock() {
		return Price*quantity;
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void RemoverProduct(int quantity) {
		this.quantity-=quantity;
	}
	
	public String toString() {
		return Name
				+ ", $"
				+ String.format("%.2f", Price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", TotalValueInStock());
	}	
	
}
