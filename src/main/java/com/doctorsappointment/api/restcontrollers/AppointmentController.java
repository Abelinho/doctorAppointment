package com.doctorsappointment.api.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.doctorsappointment.api.dto.DoctorAppointmentRequestDto;
import com.doctorsappointment.api.model.Appointment;
import com.doctorsappointment.api.model.Doctor;
import com.doctorsappointment.api.repository.AppointmentRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AppointmentController {

	

}
