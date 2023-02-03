package com.aurionpro.model;

public class Player {
	private String name;
	private int age;
	private String country;
	
	
	
	

	public Player(String name, int age, String country) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", country=" + country + "]";
	}
	
	
//	public  Player elderPlayer(Player[] arr) {
	// Using BUBBLE SORT METHOD.
	public Player elderPlayer(Player[] players) {
		double maxAge = players[0].age;  // agar same hi class mein h toh 'age'...warna getAge()
		int index = 0;
		for (int i = 0; i < 4; i++) {      // agar khudse compare nhi karwana h toh i =1 
			if (maxAge < (players[i].age)) {
				maxAge = players[i].age;
				index = i;
			}
		}
		return players[index];
	}
}
