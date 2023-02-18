package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Regions {
	private int id;
	private String name;
	private List<Country> countries;

	public Regions(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		countries = new ArrayList<Country>();
	}
//method
	public void addCountry(Country country) {
		countries.add(country);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Country> getCountries() {
		return countries;
	}

//	public void setCountries(List<Country> countries) {
//		this.countries = countries;
//	}
	@Override
	public String toString() {
		return "\nRegions [id = " + id + ", name = " + name + ", countries = " + countries + "]";
	}

}
