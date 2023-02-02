package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {

		Account[] account2 = new Account[5];
		account2[0] = new Account(121, "Akshay", 89625);
		account2[1] = new Account(122, "Aditya", 51630);
		account2[2] = new Account(123, "Thappa", 61395);
		account2[3] = new Account(124, "Sameer", 98246);
		account2[4] = new Account(125, "Mahto", 36849);

		for (Account acc : account2) {
			System.out.println(acc);
		}

		System.out.println();
		System.out.println("Highest balance:");
		double maxBalance = account2[0].getBalance();
		int index = 0;
		for (int i = 0; i < 5; i++) {
			if (maxBalance < (account2[i].getBalance())) {
				maxBalance = account2[i].getBalance();
				index = i;
			}
		}
		System.out.println(account2[index]);
		
		System.out.println();
		System.out.println("Sorted array");
		sortArray(account2);
		for(Account x :account2) {
		System.out.println(x);
		}
	}

	private static void sortArray(Account[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i-1;j++) {
				if(arr[j].getBalance()  < arr[j+1].getBalance()) {
					Account temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
	}

}
