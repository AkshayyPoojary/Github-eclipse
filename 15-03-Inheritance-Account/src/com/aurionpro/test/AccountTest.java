package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		SavingAccount saving = new SavingAccount(1001, "Akshay", 20000);
		saving.deposit(2000);
		saving.withdraw(1000);
		printSavingAccountDetail(saving);
		
		
		CurrentAccount current = new CurrentAccount(1002, "Sneha", 2000);
		current.deposit(2000);
		current.withdraw(15000);
		printCurrentAccountDetail(current);
	}

	private static void printSavingAccountDetail(SavingAccount saving) {

		System.out.println("Account detail is: "+ saving.getAccountNumber());
		System.out.println("Account holder name: "+saving.getName());
		System.out.println("amount balance: "+saving.getBalance());

		
	}

	private static void printCurrentAccountDetail(CurrentAccount current) {
		System.out.println();
		System.out.println("Account detail is: "+ current.getAccountNumber());
		System.out.println("Account holder name: "+current.getName());
		System.out.println("amount balance: "+current.getBalance());
	}

}
