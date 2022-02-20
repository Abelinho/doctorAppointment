package com.doctorsappointment.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doctorsappointment.api.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

	//List<Appointment> findByPatientIdAndComponentNameOrderByMeasuredDateTime(int patientId, String componentName);

}
