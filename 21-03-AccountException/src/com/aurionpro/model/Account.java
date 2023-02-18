package com.aurionpro.model;

public class Account {
	private int acountNumber;
	private String name;
	private double balance;

	public Account(int acountNumber, String name, double balance) {
		this.acountNumber = acountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAcountNumber() {
		return acountNumber;
	}

	public void setAcountNumber(int acountNumber) {
		this.acountNumber = acountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// method
	public void deposit(double amount) {
		balance+=amount;
	}

	// method
	public void withdraw(double amount) throws InsufficientBalanceException {
		if (balance - amount < 1000) {
			throw new InsufficientBalanceException(this, amount);
		}
		balance -= amount;          // if not exception then proceed with this condition
	}

}
