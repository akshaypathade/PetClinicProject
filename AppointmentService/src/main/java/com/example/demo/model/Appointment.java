package com.example.demo.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="APPOINTMENTS")
@Entity
public class Appointment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@Column(name="APPOINTMENTID")
	Integer appointmentId;
	
	@Column(name="DATE")
	Date date;
	
	@Column(name="TIME")
	String time;
	
	@Column(name="OWNERID")
	Integer ownerId;

	@Column(name="PETID")
	Integer petId;

	public Appointment() {
		super();
	}

	


	public Appointment(Integer appointmentId, Date date, String time, Integer ownerId, Integer petId) {
		super();
		this.appointmentId = appointmentId;
		this.date = date;
		this.time = time;
		this.ownerId = ownerId;
		this.petId = petId;
	}

	public Integer getAppointmentId() {
		return appointmentId;
	}


	public Integer getPetId() {
		return petId;
	}

	public void setPetId(Integer petId) {
		this.petId = petId;
	}

	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public Integer getOwnerId() {
		return ownerId;
	}


	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}




	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", date=" + date + ", time=" + time + ", ownerId="
				+ ownerId + ", petId=" + petId + "]";
	}
	
	
	
	
}
