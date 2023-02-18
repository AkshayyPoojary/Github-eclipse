package com.aurionpro.model;

public class Country {
	private String reg;
	private String name;
	private int pincode;
	public Country(String reg, String name, int pincode) {
		super();
		this.reg = reg;
		this.name = name;
		this.pincode = pincode;
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "\nCountry [reg = " + reg + ", name = " + name + ", pincode = " + pincode + "]";
	}
	
	
}
