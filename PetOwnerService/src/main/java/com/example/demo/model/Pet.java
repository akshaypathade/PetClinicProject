package com.example.demo.model;

import java.io.Serializable;

import java.util.List;



public class Pet implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	Integer petId;
	

	String name;
	
	String animalFamily;
	
	String type;
	
	Integer age;
	
	Integer ownerId;
	
	List<Appointment> appointments;
	
	public Pet() {
		super();
	}

	public Pet(Integer petId, String name, String animalFamily, String type, Integer age, Integer ownerId, List<Appointment> appointments) {
		super();
		this.petId = petId;
		this.name = name;
		this.animalFamily = animalFamily;
		this.type = type;
		this.age = age;
		this.ownerId = ownerId;
		this.appointments=appointments;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public Integer getPetId() {
		return petId;
	}

	public void setPetId(Integer petId) {
		this.petId = petId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnimalFamily() {
		return animalFamily;
	}

	public void setAnimalFamily(String animalFamily) {
		this.animalFamily = animalFamily;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", name=" + name + ", animalFamily=" + animalFamily + ", type=" + type + ", age="
				+ age + ", ownerId=" + ownerId + "]";
	}
	
	
	
}
