package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.attendance;
import com.example.demo.entity.student;
import com.example.demo.repository.attendancerepository;
import com.example.demo.repository.studentrepository;

@Service
public class attendanceservice {
	@Autowired
	private attendancerepository repository;
	
	public attendance saveattendance(attendance adc) {
		return repository.save(adc);    
	}
	public List<attendance> saveattendances(List<attendance> adc) {
		return repository.saveAll(adc);      
	}
	public List<attendance> getattendances(){
		return repository.findAll();
	}
	public attendance getattendanceById(int attendance_id){
		return repository.findById(attendance_id).orElse(null);
	}
	public attendance getattendanceById1(int ukey){
		return repository.findById(ukey).orElse(null);
	}
	public attendance getattendanceById2(int student_id){
		return repository.findById(student_id).orElse(null);
	}
	public attendance getattendanceById3(int status){
		return repository.findById(status).orElse(null);
	}
	public String deleteattendance(int attendance_id) {
		repository.deleteById(attendance_id);
		return "deleted" +attendance_id;
	}
	   public attendance updateattendance(attendance adc) {
		attendance existingattendance=repository.findById(adc.getAttendance_id()).orElse(null);
		existingattendance.setUkey(adc.getUkey());
		existingattendance.setStudent_id(adc.getStudent_id());
		existingattendance.setStatus(adc.getStatus());
		return repository.save(existingattendance);
	}
	
	
	
}



