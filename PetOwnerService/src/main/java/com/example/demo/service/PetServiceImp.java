package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Appointment;
import com.example.demo.model.Pet;

public class PetServiceImp implements PetService{

	@Override
	public List<Pet> findByOwnerId(Integer ownerId) {
		List<Pet> defaultList = new ArrayList<>();
		List<Appointment> appointments = new ArrayList<>();
		defaultList.add(new Pet(0000,"N/A","N/A","N/A",000,000, appointments));
        return defaultList;
	}

	@Override
	public Pet update(Integer petId) {
		return null;
	}

	@Override
	public void delete(Integer petId) {
		
	}

	@Override
	public Pet save(Pet pet) {
		return null;
	}

}
