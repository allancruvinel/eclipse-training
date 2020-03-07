package util;

public class Conta {
	private static int numero;
	private String titular;
	private double deposito;
	
	public Conta(int numero,String titular) {
		Conta.numero = numero; this.titular = titular;this.deposito = 0;
	}
	
	public Conta(int numero,String titular,double deposito) {
		Conta.numero = numero; this.titular = titular;this.deposito = deposito;
	}
	
	public int getNumero() {
		return Conta.numero;
	}
	public String getTitular() {
		return this.titular;
	}
	public double getDeposito() {
		return this.deposito;
	}
	public void depositar(double valor) {
		this.deposito+=valor;
	}
	public void sacar(double valor) {
		this.deposito-=valor+5;
	}
	
	public String toString() {
		return "Account Data\n"+
		"Account "+getNumero()
		+", Holder: "
		+getTitular()
		+", Balance: $ "
		+getDeposito();
	}
	
}
