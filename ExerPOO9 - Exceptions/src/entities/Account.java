package entities;

import exceptions.DomainException;

public class Account {
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public Account(int number,String holder,double balance,double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public void withdraw(double balance) {
		if(balance>this.withdrawLimit) {
			throw new DomainException("Balanço acima do limite de saque");
		}
		if(balance>this.balance) {
			throw new DomainException("Saldo para saque indisponível");
		}
		if(balance<0) {
			throw new DomainException("O saque não pode ser negativo");
		}
		this.balance-= balance;
	}
	
	public String actualBalance() {
		return "balanço atual "+this.balance;
	}
}
