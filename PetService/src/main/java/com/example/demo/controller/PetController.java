package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Appointment;
import com.example.demo.model.Pet;
import com.example.demo.repository.PetRepository;
import com.example.demo.service.AppointmentService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
public class PetController {
	private static final Logger logger = LoggerFactory.getLogger(PetController.class);
	
	@Autowired
	private PetRepository petRepository;
	
	@Autowired
	AppointmentService appointmentService;
	
	@GetMapping(value = "/pet")
	public Iterable<Pet> all() {
		logger.info("Find all pets information ");
		List<Pet> pets = petRepository.findAll();
		for (int i = 0; i < pets.size();i++) {
			pets.get(i).setAppointments(appointmentService.findByPetId(pets.get(i).getPetId()));
		}
		return pets;
	}
	
	@GetMapping(value = "/pet/{petId}")
	public Pet findByPetId(@PathVariable Integer petId) {
		logger.info("Find by Pet ID :"+petId);
		Pet pet = petRepository.findByPetId(petId);
		pet.setAppointments(appointmentService.findByPetId(petId));
		return pet;
	}

//	@GetMapping(value = "/pet/animalfamily/{animalFamily}")
//	public List<Pet> findByAnimalFamily(@PathVariable String animalFamily) {
//		logger.info("Find by animal family :"+ animalFamily);
//		return petRepository.findByAnimalFamily(animalFamily);
//	}
//	
	@GetMapping(value = "/pet/owner/{ownerId}")
	public List<Pet> findByOwnerId(@PathVariable Integer ownerId) {
		logger.info("Find by Owner :"+ ownerId);
		List<Pet> pets = petRepository.findByOwnerId(ownerId);
//		pet.setAppointments(appointmentService.findByOwnerId(ownerId));
		for(int i = 0; i < pets.size(); i ++) {
			pets.get(i).setAppointments(appointmentService.findByPetId(pets.get(i).getPetId()));
		}
		return pets;
	}
	
	
	
	@PostMapping(value = "/pet")
	public Pet save(@RequestBody Pet pet) {
		List<Appointment> appointments = pet.getAppointments();
		for(Appointment a:appointments) {
			appointmentService.save(a);
		}
		Pet result = petRepository.save(pet);

		result.setAppointments(appointmentService.findByPetId(result.getPetId()));
		return result;

	}
	
	
	@PutMapping(value = "/pet")
	public Pet update(@RequestBody Pet pet) {
		logger.info("Update pet :"+ pet);
		return petRepository.save(pet);
	}
	
	@DeleteMapping(value = "/pet")
	public void delete(@RequestBody Pet pet) {
		logger.info("Delete pet :"+pet);
		petRepository.delete(pet);
	}
	
	
}
