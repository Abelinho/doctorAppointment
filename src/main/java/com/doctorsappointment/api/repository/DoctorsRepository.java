package com.doctorsappointment.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doctorsappointment.api.model.Doctor;

public interface DoctorsRepository extends JpaRepository<Doctor, Integer> {

	//List<Doctor> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);

}
