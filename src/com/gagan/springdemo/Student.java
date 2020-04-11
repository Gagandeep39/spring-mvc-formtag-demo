package com.gagan.springdemo;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favouriteLanguage;
	
	private LinkedHashMap<String, String> countryList;
	private String[] OperatingSystems;
	
	
	
	
	public String[] getOperatingSystems() {
		return OperatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		OperatingSystems = operatingSystems;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student() {
		// To populate dropdown in form
		countryList = new LinkedHashMap<>();
		countryList.put("IND", "India");
		countryList.put("US", "United States of America");
		countryList.put("CN", "Canada");
		countryList.put("FR", "France");
	}
	
	

	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}

	public void setCountryList(LinkedHashMap<String, String> countryList) {
		this.countryList = countryList;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country
				+ ", favouriteLanguage=" + favouriteLanguage + ", OperatingSystems=" + Arrays.toString(OperatingSystems)
				+ "]";
	}
	
	

}
