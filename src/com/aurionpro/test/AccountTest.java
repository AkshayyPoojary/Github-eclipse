package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
//		Account account = new Account(1001,"Sneha",50000);
//		printAccDetails(account);
//		
//		account.withdraw(50000);
//		printAccDetails(account);
//		
//		account.deposite(20000);
//		printAccDetails(account);
		
		Account account1 =new Account();
//		account1.deposite(5000);
		account1.withdraw(500);
		printAccDetails(account1);
		
//		Account account1 = new Account();	
	}

	private static void printAccDetails(Account account) {
		// TODO Auto-generated method stub
		System.out.println("AccountNumber: "+account.getAccountNumber());
		System.out.println("Name: "+account.getName());
//		System.out.println("Deposite: "+account.getBalance());
		System.out.println("Withdraw: "+account.getBalance());
		
	}
}
