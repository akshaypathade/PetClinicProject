package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Table(name="OWNERS")
@Entity
public class PetOwner implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="OWNERID")
	Integer ownerId;
	
	@Column(name="FIRSTNAME")
	String firstName;
	
	@Column(name="LASTNAME")
	String lastName;
	
	@Column(name="PHONENUMBER")
	String phoneNumber;
	
	@Column(name="EMAIL")
	String email;
	
	@Transient
	List<Pet> pets;
	
	
	
	

	public PetOwner() {
		super();
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
		
	}

	
	
	@Override
	public String toString() {
		return "PetOwner [ownerId=" + ownerId + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", pets=" + pets +  "]";
	}
	
	
	
	

}
