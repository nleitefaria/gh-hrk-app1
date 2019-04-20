package com.mycompany.ghhrkapp1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persons 
{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Integer id;	
	private String firstName;
	private String lastName;
	
	public Persons() {	
	}
	
	public Persons(String firstName, String lastName) {	
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Persons(Integer id, String firstName, String lastName) {	
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
