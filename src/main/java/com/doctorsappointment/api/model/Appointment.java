package com.doctorsappointment.api.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.doctorsappointment.api.enums.AppointmentType;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "appointment")
public class Appointment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String patientFirstName;
	private String patientLastName;
	@CreationTimestamp
	private LocalDateTime measuredDateTime;
	@Enumerated(EnumType.STRING)
	private AppointmentType appointmentType;

	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doctor_id", nullable = false)
	@JsonIgnore
	private Doctor doctor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getpatientFirstName() {
		return patientFirstName;
	}

	public void setpatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public LocalDateTime getMeasuredDateTime() {
		return measuredDateTime;
	}

	public void setMeasuredDateTime(LocalDateTime measuredDateTime) {
		this.measuredDateTime = measuredDateTime;
	}

	public String getpatientLastName() {
		return patientLastName;
	}

	public void setpatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}
	
	public AppointmentType getAppointmentType() {
		return appointmentType;
	}

	public void setAppointmentType(AppointmentType appointmentType) {
		this.appointmentType = appointmentType;
	}

}
