package com.doctorsappointment.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorsappointment.api.model.Doctor;
import com.doctorsappointment.api.repository.DoctorsRepository;

@Service
public class DoctorService {
  
	@Autowired
	DoctorsRepository doctorsRepository;
	
	public List<Doctor> getDoctors() {
		
		return doctorsRepository.findAll();
	}
	
	public Doctor getDoctorById(int id) {
		
		return doctorsRepository.findById(id).get();
	}
	
	//todo: methods for saveDoctor and UpdateDoctor
	
    public Doctor saveDoctor(Doctor doctor) {
		
		return doctorsRepository.save(doctor);
	}
}
