package com.aurionpro.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aurionpro.model.Country;
import com.aurionpro.model.Regions;

public class RegionTest {
	public static void main(String[] args) {
		
//		Map<Integer,Regions> charCountMap = new HashMap<>();
		
		List<Regions> region = new ArrayList<>();
		region.add(new Regions(1, "Europe"));
		region.add(new Regions(2, "Americas"));
		region.add(new Regions(3, "Asia"));
		region.add(new Regions(4, "Middle East and Africa"));

//		System.out.println(region);
		List<Country> countries = new ArrayList<>();
		countries.add(new Country("IT", "Italy", 1));
		countries.add(new Country("JP", "Japan", 3));
		countries.add(new Country("US", "United States of America", 2));
		countries.add(new Country("CA", "Canada", 2));
		countries.add(new Country("CN", "China", 3));
		countries.add(new Country("IN", "India", 3));
		countries.add(new Country("AU", "Australia", 3));
		countries.add(new Country("ZW", "Zimbabwe", 4));
		countries.add(new Country("SG", "Singapore", 3));
		countries.add(new Country("UK", "United Kingdom", 1));
		countries.add(new Country("FR", "France", 1));
		countries.add(new Country("DE", "Germany", 1));
		countries.add(new Country("ZM", "Zambia", 4));
		countries.add(new Country("EG", "Egypt", 4));
		countries.add(new Country("BR", "Brazil", 2));
		countries.add(new Country("CH", "Switzerland", 1));
		countries.add(new Country("NL", "Netherlands", 1));
		countries.add(new Country("MX", "Mexico", 2));
		countries.add(new Country("KW", "Kuwait", 4));
		countries.add(new Country("IL", "Israel", 4));
		countries.add(new Country("DK", "Denmark", 1));
		countries.add(new Country("HK", "HongKong", 3));
		countries.add(new Country("NG", "Nigeria", 4));
		countries.add(new Country("AR", "Argentina", 2));
		countries.add(new Country("BE", "Belgium", 1));
//		System.out.println(countries);
		for(Country x: countries) {
			int id=x.getPincode();
			region.get(id-1).addCountry(x);
			
//			System.out.println(id);
		}
		System.out.println(region);
	}
}
