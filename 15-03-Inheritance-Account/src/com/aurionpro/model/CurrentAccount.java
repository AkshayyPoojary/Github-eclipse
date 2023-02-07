package com.aurionpro.model;

public class CurrentAccount extends Account {
	static final int OVER_DRAFT_LIMIT = -20000;

	public CurrentAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
		
	}
	
	public CurrentAccount(int accountNumber, String name) {
		super(accountNumber, name);		
	}
	
	@Override
	public void withdraw(double amount) {
		if(balance- amount>OVER_DRAFT_LIMIT) {
			balance-= amount;
		}
	}



}
