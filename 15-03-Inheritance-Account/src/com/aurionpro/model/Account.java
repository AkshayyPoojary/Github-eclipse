package com.aurionpro.model;

public class Account {
	private int accountNumber;
	public double balance;
	private String name;

	
	

	public Account(int accountNumber, String name, double balance) { // Constructor
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
	}

	public Account(int accountNumber, String name) { // Two variable constructor
		this(accountNumber, name, 1000);
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	// creating a method to call in test file
	public void deposit(double amount) {
		balance += amount;

	}

	public void withdraw(double amount) {
		balance -= amount;

	}

}
