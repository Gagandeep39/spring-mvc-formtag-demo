/**
 * Gagandeep
 * 8:45:35 am
 * 04-Apr-2020
 */
package com.gagan.springdemo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.gagan.validation.CourseCode;
// dont EVER FORGET getter and setter
public class Customer {
	
	private String firstName;
	
	@NotNull(message = "Can't be null")	//java.peersistence import
	@Size(min = 4, message = "Minimum lengthh should be 4")
	private String lastName;
	
	// to demonstrate umber range
	@Min(value = 2, message = "Lenth must be min 2")
	@Max(value = 10, message = "Lenth must be max 2")
	@NotNull(message = "Can't be null")	//java.peersistence import
	private Integer freePasses;
	//	private int freePasses; //will give error Failed to convert property value of type java.lang.String to required type int for property freePasses;
	// String cannot be conerted to int, but can be converted to Integer

	@Pattern(regexp = "^[0-9]{6}", message = "Must be only 6 digits")	//cannit be in int
	private String pincode;
	
	@CourseCode(value = "Gagan", message = "Must start with Gagan")
	private String courseCode;
	
	
	
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	
	public Customer() {
	}
	
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", freePasses=" + freePasses
				+ ", pincode=" + pincode + ", courseCode=" + courseCode + "]";
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

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	
	
	

}
