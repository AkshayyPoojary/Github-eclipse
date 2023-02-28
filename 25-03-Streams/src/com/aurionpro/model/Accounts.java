package com.aurionpro.model;

public class Accounts {
	private int accountnumber;
	private String name;
	private double balnace;
	public Accounts(int accountnumber, String name, double balnace) {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.balnace = balnace;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalnace() {
		return balnace;
	}
	public void setBalnace(double balnace) {
		this.balnace = balnace;
	}
	@Override
	public String toString() {
		return "Accounts [accountnumber=" + accountnumber + ", name=" + name + ", balnace=" + balnace + "]";
	}

	
	
}
