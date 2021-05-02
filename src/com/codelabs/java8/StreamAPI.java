package com.codelabs.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);
		intList.add(50);
		// Counting
		long count = intList.stream().collect(Collectors.counting());
		System.out.println(count);

		// Averaging int
		Double result1 = intList.stream().collect(Collectors.averagingInt(v -> v));
		System.out.println(result1);

		List<String> nameList = new ArrayList<>();
		nameList.add("Arpit");
		nameList.add("John");
		nameList.add("Martin");
		// Counting
		String stringWithHyphen = nameList.stream().collect(Collectors.joining("-"));
		System.out.println("String with hyphen : " + stringWithHyphen);
		String stringWithHyphenAndPrefixAndSuffix = nameList.stream().collect(Collectors.joining("-", "==", "=="));
		System.out.println("String with hyphen , suffix and prefix :  " + stringWithHyphenAndPrefixAndSuffix);

		// Summing int
		int result2 = intList.stream().collect(Collectors.summingInt(v -> v));
		System.out.println(result2);

		// collectingAndThen
		int result3 = intList.stream()
				.collect(Collectors.collectingAndThen(Collectors.summingInt(v -> (int) v), result -> result / 2));
		System.out.println(result3);
		
		
		List<Country> items = new ArrayList<>();
		items.add(new Country("India", 20000));
		items.add(new Country("China", 40000));
		items.add(new Country("Nepal", 30000));
		items.add(new Country("India", 50000));
		items.add(new Country("China", 10000));
			 
		  // Group by countryName
		  Map<String, List<Country>> groupByCountry = items.stream().collect(
		    Collectors.groupingBy(Country::getCountryName));
		 
		  System.out.println(groupByCountry.get("India"));
		 
		  // Group by CountryName and calculates the count
		  Map<String, Long> counting = items.stream().collect(
		    Collectors.groupingBy(Country::getCountryName,Collectors.counting()));
		 
		  // Group by countryName and sum up the population
		  System.out.println(counting);
		  Map<String, Long> populationCount = items.stream().collect(
		    Collectors.groupingBy(Country::getCountryName,
		      Collectors.summingLong(Country::getPopulation)));
		  System.out.println(populationCount);

	}
}

class Country {

	String countryName;
	long population;

	public Country() {
		super();
	}

	public Country(String countryName, long population) {
		super();
		this.countryName = countryName;
		this.population = population;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
		result = prime * result + (int) (population ^ (population >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		if (population != other.population)
			return false;
		return true;
	}

	public String toString() {
		return "{" + countryName + "," + population + "}";
	}
}
