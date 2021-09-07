package com.example.demo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Appointment;


@Service
@FeignClient(name="appointment-service", fallback = AppointmentServiceImp.class)
public interface AppointmentService {
	
	

	@GetMapping(value="/appointment/pet/{petId}")
	List<Appointment> findByPetId(@PathVariable("petId") Integer petId );
	
	@PutMapping(value="/appointment")
	Appointment update(@PathVariable("appointmentId") Integer appointmentId);
	
	@GetMapping(value = "/appointment/owner/{ownerId}")
	List<Appointment> findByOwnerId(@PathVariable("ownerId") Integer ownerId);
	
	@DeleteMapping(value="/appointment")
	void delete(@PathVariable("appointmentId") Integer appointmentId);
	
	@PostMapping(value="/appointment")
	Appointment save(@RequestBody Appointment appointment);
	
}

