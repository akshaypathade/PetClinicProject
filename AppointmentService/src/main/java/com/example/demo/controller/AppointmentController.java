package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Appointment;

import com.example.demo.repository.AppointmentRepository;



@RestController
public class AppointmentController {
	private static final Logger logger = LoggerFactory.getLogger(AppointmentController.class);
	
	@Autowired
	AppointmentRepository appointmentRepository;
	
	@GetMapping(value = "/appointment")
	public Iterable<Appointment> all() {
		logger.info("Find all appointments ");
		return appointmentRepository.findAll();
	}
	
	
	@GetMapping(value = "/appointment/{appointmentId}")
	public Appointment findByAppointmentId(@PathVariable Integer appointmentId) {
		logger.info("Find by appointment ID :"+appointmentId);
		return appointmentRepository.findByAppointmentId(appointmentId);
	}

	@GetMapping(value="/appointment/pet/{petId}")
	List<Appointment> findByPetId(@PathVariable("petId") Integer petId ){
		return appointmentRepository.findByPetId(petId);
		
	}
	
	@GetMapping(value = "/appointment/owner/{ownerId}")
	public List<Appointment> findByOwnerId(@PathVariable Integer ownerId) {
		logger.info("Find by Owner :"+ ownerId);
		return appointmentRepository.findByOwnerId(ownerId);
	}
	
	@PostMapping(value = "/appointment")
	public Appointment save(@RequestBody Appointment appointment) {
		return appointmentRepository.save(appointment);

	}
	
	
	@PutMapping(value = "/appointment")
	public Appointment update(@RequestBody Appointment appointment) {
		logger.info("Update appointment :"+ appointment);
		return appointmentRepository.save(appointment);
	}
	
	@DeleteMapping(value = "/appointment")
	public void delete(@RequestBody Appointment appointment) {
		logger.info("Delete appointment :"+appointment);
		appointmentRepository.delete(appointment);
	}
	
	
	
	
}
