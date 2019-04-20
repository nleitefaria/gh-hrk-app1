package com.mycompany.ghhrkapp1.dto;

public class PersonsDTO 
{
	private String firstName;
	private String lastName;
	
	public PersonsDTO() {		
	}
	
	public PersonsDTO(String firstName, String lastName) {		
		this.firstName = firstName;
		this.lastName = lastName;
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
}
