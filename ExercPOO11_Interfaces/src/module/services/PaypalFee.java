package module.services;

public class PaypalFee implements ServiceFee {
	

	public double feeReturn (double value,int actualMonth) {
		double aux = value +  value*0.01*actualMonth;
		return aux = aux + aux *0.02;
	}
}
