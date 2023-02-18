package com.aurionpro.model;

public class InsufficientBalanceException extends Exception {

	Account account;
	double amount;

	public InsufficientBalanceException(Account account, double amount) {
		super();
		this.account = account;
		this.amount = amount;
	}

	@Override
	public String getMessage() {
		String message = "Cannot withdraw amount $" + amount;
		message+="\nAcount Number "+account.getAcountNumber();
		message+="\nCurrent Balance $"+account.getBalance();
		return message;
	}
}
