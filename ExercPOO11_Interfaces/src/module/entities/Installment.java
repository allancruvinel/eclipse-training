package module.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
	private Date payment;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private double payValue;
	
	public Installment() {
		
	}
	
	public Installment(Date payment, Double payValue) {
		this.payment = payment;
		this.payValue = payValue;
	}

	public String getPaymentDate() {
		return sdf.format(payment);
	}

	public void setPayment(Date payment) {
		this.payment = payment;
	}

	public double getPayValue() {
		return payValue;
	}

	public void setPayValue(double payValue) {
		this.payValue = payValue;
	}
	
	
	
	
	
	
}
	
