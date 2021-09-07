package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pet;
import com.example.demo.model.PetOwner;
import com.example.demo.repository.PetOwnerRepository;

import com.example.demo.service.PetService;

@RestController
public class PetOwnerController{
	@Autowired
	PetOwnerRepository ownerRepository;
	
	
	
	@Autowired
	PetService petService;
	

	
	@PostMapping(value="/owner")
	public PetOwner save(@RequestBody PetOwner owner) {
		//get the pets from the request
		List<Pet> pets = owner.getPets();
		for(Pet pet: pets) {
			petService.save(pet);
		}
		
		
		//save the owner into the owner repository 
		PetOwner result = ownerRepository.save(owner);
		//set the pets and appointments into the owner
		result.setPets(petService.findByOwnerId(result.getOwnerId()));
		
		return result;
	}
	
	
	@GetMapping(value = "/owner")
	//find all of the Petowners and list
	public Iterable<PetOwner> all() {
		
		List<PetOwner> owners = ownerRepository.findAll();
		
		//set the pets for the owner with the correct owner id
		for (int i = 0; i <owners.size();i++) {
			owners.get(i).setPets(petService.findByOwnerId(owners.get(i).getOwnerId()));
			
		}
		
		
		return owners;
	}
	
	@GetMapping(value = "/owner/{ownerId}")
	public PetOwner findByOwnerId(@PathVariable Integer ownerId) {
		PetOwner owner = ownerRepository.findByOwnerId(ownerId);
		owner.setPets(petService.findByOwnerId(ownerId));
		
		return owner;
	}
	
	
	
	@PutMapping(value = "/owner")
	public PetOwner update(@RequestBody PetOwner petOwner) {
		return ownerRepository.save(petOwner);
	}

	@DeleteMapping(value = "/owner")
	public void delete(@RequestBody PetOwner owner) {
		ownerRepository.delete(owner);
	}
	
	
	
	
	
}
