package com.aurionpro.model;

public class Account {
	private int accountNumber;
	private double balance;
	private String name; 

	public Account(int accountNumber, String name, double balance) { // Constructor
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;

	}

	public Account(int accountNumber, String name) { // Two variable constructor
		this(accountNumber, name, 1000);
	}

	public Account(int accountNumber) { // values with Default value
		this(accountNumber, "Unknown", 1000);

	}

	public Account() { // Default
		this(1000);
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

}

