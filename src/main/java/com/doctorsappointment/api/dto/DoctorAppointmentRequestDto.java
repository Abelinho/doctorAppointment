package com.doctorsappointment.api.dto;

public class DoctorAppointmentRequestDto {
	private String patientFirstName;
	private String patientLastName;
	private String timeOfAppointmet;
	private String kindOfAppointment;
	
	public String getPatientFirstName() {
		return patientFirstName;
	}
	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}
	public String getPatientLastName() {
		return patientLastName;
	}
	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}
	public String getTimeOfAppointmet() {
		return timeOfAppointmet;
	}
	public void setTimeOfAppointmet(String timeOfAppointmet) {
		this.timeOfAppointmet = timeOfAppointmet;
	}
	public String getKindOfAppointment() {
		return kindOfAppointment;
	}
	public void setKindOfAppointment(String kindOfAppointment) {
		this.kindOfAppointment = kindOfAppointment;
	}

	
}
