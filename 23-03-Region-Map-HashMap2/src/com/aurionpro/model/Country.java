package com.aurionpro.model;

public class Country {
	private String regId;
	private String name;
	private int pinCode;
	public Country(String regId, String name, int pinCode) {
		super();
		this.regId = regId;
		this.name = name;
		this.pinCode = pinCode;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "\nCountry [regId = " + regId + ", name = " + name + ", pinCode = " + pinCode + "]";
	}
	
	
}
