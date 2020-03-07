package util;

public class CurrencyConverter {
	public static final double IOF = 6;
	
	public static double realConverter(double real,double dolar) {
		
		return real*dolar/100*IOF+real*dolar;
	}
}
