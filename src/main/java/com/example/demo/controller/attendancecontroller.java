package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.attendance;
import com.example.demo.service.attendanceservice;
@RestController
public class attendancecontroller {
	
	  @Autowired
	    private attendanceservice service;
	    
	    //@PostMapping("/addattendance")
	    public attendance addattendance(@RequestBody attendance adc) {
	    	return service.saveattendance(adc);
	    }
	   //@PostMapping("/addattendances")
		public List<attendance> addattendances(@RequestBody List<attendance> adc ) {
			return service.saveattendances(adc);
		}
		//@GetMapping("/attendance")
	    public List<attendance> findAllattendances(){
	    	return service.getattendances();
	    }
	    //@GetMapping("/attendance/{attendance_id}")
	    public attendance findattendanceById(@PathVariable int attendance_id) {
	    	return service.getattendanceById(attendance_id);
	    }
	    //@GetMapping("/attendance/{ukey}")
	    public attendance findattendanceById1(@PathVariable int ukey) {
	    	return service.getattendanceById1(ukey);
	    }
	   //@GetMapping("/attendance/{student_id}")
	    public attendance findattendanceById2(@PathVariable int  student_id) {
	    	return service.getattendanceById(student_id);
	    }
	    //@GetMapping("/attendance/{status}")
	    public attendance findattendanceById3(@PathVariable int  status) {
	    	return service.getattendanceById3(status);
	    }
	    
	     //@PutMapping("/update/{attendance_id}")
		public attendance updateattendance(@RequestBody attendance adc){
			return service.updateattendance(adc);
	    }
	   // @DeleteMapping("/delete/{attendance_id}")
	    public String deleteattendance(@PathVariable int attendance_id){
	    	return service.deleteattendance(attendance_id);
	    }
	}
	    	
	    



