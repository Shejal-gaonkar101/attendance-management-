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

import com.example.demo.entity.semester;
import com.example.demo.entity.student;
import com.example.demo.service.studentservice;

@RestController
public class studentcontroller {
    @Autowired
    private studentservice service;
    
    //@PostMapping("/addstudent")
    public student addstudent(@RequestBody  student stnt) {
    	return service.savestudent(stnt);
    }
    //@PostMapping("/addstudents")
	public List<student> addstudents(@RequestBody List<student> stnt ) {
		return service.savestudents(stnt);
	}
	//@GetMapping("/students")
    public List<student> findAllstudents(){
    	return service.getstudents();
    }
   //@GetMapping("/students/{student_id}")
    public student findstudentById(@PathVariable int student_id) {
    	return service.getstudentById(student_id);
    }
    //@GetMapping("/students/{sname}")
    public student findstudentBysname(@PathVariable String  sname) {
    	return service.getstudentBysname(sname);
    }
    //@GetMapping("/students/{sem_id}")
    public student findstudentById1(@PathVariable int  sem_id) {
    	return service.getstudentById(sem_id);
    }
    
    //@PutMapping("/update/{student_id}")
	public student updatestudent(@RequestBody student stnt ){
		return service.updatestudent(stnt);
    }
    //@DeleteMapping("/delete/{student_id}")
    public String deletestudent(@PathVariable int student_id){
    	return service.deletestudent(student_id);
    }
}
    	
    
