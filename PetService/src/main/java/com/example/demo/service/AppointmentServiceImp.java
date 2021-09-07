package com.example.demo.service;

import java.sql.Date;
import java.util.ArrayList;

import java.util.List;

import com.example.demo.model.Appointment;
	

public class AppointmentServiceImp implements AppointmentService{

	@Override
	public List<Appointment> findByPetId(Integer petId) {
		List<Appointment> defaultList = new ArrayList<>();
		Date sqlDate = new Date(0);
		defaultList.add(new Appointment(Integer.valueOf(0000),sqlDate,"N/A",Integer.valueOf(0000),0));
        return defaultList;
	}

	@Override
	public Appointment update(Integer appointmentId) {
		return null;
	}

	@Override
	public void delete(Integer appointmentId) {
		
	}

	@Override
	public Appointment save(Appointment appointment) {
		return null;
	}

	@Override
	public List<Appointment> findByOwnerId(Integer ownerId) {
		List<Appointment> defaultList = new ArrayList<>();
		Date sqlDate = new Date(0);
		defaultList.add(new Appointment(Integer.valueOf(0000),sqlDate,"N/A",Integer.valueOf(0000),0));
        return defaultList;
	}

}

