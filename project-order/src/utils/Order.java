package utils;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import utilsEnum.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	List<OrderItem> item = new ArrayList<>();
	private Client client;
	SimpleDateFormat datemoment = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Order(String status, Client client) {
		this.moment = new Date(System.currentTimeMillis());
		this.status = OrderStatus.valueOf(status);
		this.client = client;
	}
	
	public void addItem(OrderItem orderitem) {
		item.add(orderitem);
	}
	
	public void removeItem(OrderItem orderitem) {
		item.remove(orderitem);
	}
	
	public double totalPrice() {
		double total=0;
		for(OrderItem c: item) {
			total+=c.subTotal();
		}
		return total;
	}
	
	
	
	public OrderStatus getStatus() {
		return status;
	}
	
	
	
	public Client getClient() {
		return client;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("order moment: "+ datemoment.format(moment)+"\n");
		sb.append("orderstatus "+getStatus()+"\n");
		sb.append("Cliente "+getClient().getName()+" ("+getClient().getBirthDate()+") - "+getClient().getEmail()+"\n");;
		sb.append("order items\n");
		for(OrderItem c:item) {
			sb.append(c.getProduct().getName()+", quantity "+c.getQuantity()+", total "+c.subTotal()+"\n");
		}
		sb.append("Total of Order "+totalPrice());
		return sb.toString();
	}
	
	
	
	
}
