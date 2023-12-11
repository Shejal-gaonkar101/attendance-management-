package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.faculty;
import com.example.demo.service.facultyservice;

@RestController
@RequestMapping
public class facultycontroller {
	@Autowired
	private facultyservice service;
	
	//@PostMapping("/addfaculty")
	public faculty addfaculty(@RequestBody faculty fact ) {
		//String Shweta = null;
		//String tname=Shweta;
		return service.savefaculty(fact);
	}
	//@PostMapping("/addfaculties")
	public List<faculty> addfaculties(@RequestBody List<faculty> fact) {
		return service.savefaculties(fact);
	}
	//@GetMapping("/faculty")
    public List<faculty> findAllfaculties(){
    	return service.getfaculties();
    }
   //@GetMapping("/faculty/{faculty_id}")
    public faculty findfacultyById(@PathVariable int faculty_id) {
    	return service.getfacultyById(faculty_id);
    }
   //@GetMapping("/faculty/{tname}")
    public faculty findfacultyBytname(@PathVariable String  tname) {
   	return service.getfacultyBytname(tname);
    }
    
    @PutMapping("/update/{faculty_id}")
	public faculty updatefaculty(@RequestBody faculty fact ){
		return service.updatefaculty(fact);
    }
   //@DeleteMapping("/delete/{faculty_id}")
    public String deletefaculty(@PathVariable int faculty_id){
    	return service.deletefaculty(faculty_id);
    }
}


