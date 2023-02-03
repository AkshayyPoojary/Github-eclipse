package com.aurionpro.model;

public class Account {
	private String accountNumber;
	private double balance;
	private String name;
	private static int i = 0;

	public Account(String accountNumber, String name, double balance) { // Constructor
		this.balance = balance;
		this.name = name;
		this.accountNumber = "S00" + i;
		i++;
	}

	public Account(String accountNumber, String name) {  // Two variable constructor
		this(accountNumber, name, 1000);
	}

	public Account(String accountNumber) {        //variable and Default
		this(accountNumber, "Unknown", 1000);

	}
	
	public Account() {                          //Default
		this("","Unknown",1000);
	}

	public void setAccountNumber(String accountNumber) {
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

	public String getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String toString() {
		return "Account [accountNumber= " + accountNumber + ", name= " + name + ", balance= " + balance + "]";
	}

	
}
