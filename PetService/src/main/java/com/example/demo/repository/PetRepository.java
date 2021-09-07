package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Pet;

public interface PetRepository extends JpaRepository<Pet,Integer>{

	Pet findByPetId(Integer petId);
	//List<Pet> findByAnimalFamily(String animalFamily);
	List<Pet> findByOwnerId(Integer ownerId);
	

}
