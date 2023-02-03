package com.aurionpro.model;

public class Account {
	private int accountNumber;
	private double balance;
	private String name;
	private static int count = 0; // using count variable to store the counted value. 

	public Account(int accountNumber, String name, double balance) { // Constructor
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
		count++;

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

	// creating a method to call in test file
	public static int getAccountCount() {

		return count; // returning count so that it will return count value
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", name=" + name + "]";
	}

}
