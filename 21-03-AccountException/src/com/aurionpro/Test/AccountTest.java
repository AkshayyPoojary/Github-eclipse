package com.aurionpro.Test;

import com.aurionpro.model.Account;
import com.aurionpro.model.InsufficientBalanceException;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account(1001, "Akshay Poojary", 1000);
		withdrawMoney(acc);
		
	}

	private static void withdrawMoney(Account acc) {
		try {
			acc.deposit(2000);
			System.out.println("Deposit successfull!!");
			System.out.println("Total amount after deposit $"+acc.getBalance());
			acc.withdraw(3000);
			System.out.println("Withdrawl Transaction successfull!!");
			System.out.println("Balance left in the account $"+acc.getBalance());
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
