package com.aurionpro.model;

public class SavingAccount extends Account {
	static final int MIN_BALANCE = 1000;

	public SavingAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
		
	}
	public SavingAccount(int accountNumber, String name) {
		super(accountNumber, name);
	}
	
	
	@Override
	public void withdraw(double amount) {
		if(balance- amount>MIN_BALANCE) {
			balance-= amount;
		}
	}
	

}
