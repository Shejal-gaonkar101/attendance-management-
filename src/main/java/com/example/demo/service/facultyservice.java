package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.faculty;
import com.example.demo.repository.facultyrepository;
@Service
public class facultyservice {
    @Autowired
	private facultyrepository repository;
     
	public faculty savefaculty(faculty fact) {

		 return repository.save(fact);
	}
	public List<faculty> savefaculties(List<faculty> fact) {
		 return repository.saveAll(fact);
	}
	public List<faculty> getfaculties(){
		return repository.findAll();
		
	}
	public faculty  getfacultyById(int faculty_id ){
		return (repository.findById(faculty_id).orElse(null));
		
	}
	public faculty  getfacultyBytname(String tname ){
	return repository.findBytname(tname);
		
	}
	
	public String deletefaculty(int faculty_id) {
		repository.deleteById(faculty_id);
		return " deleted"+faculty_id;
		
	}
	public faculty updatefaculty(faculty fact){
		faculty existingfaculty=(repository.findById(fact.getFaculty_id()).orElse(null));
		//existingfaculty.setFaculty_id(fact.getFaculty_id());
		existingfaculty.settname(fact.gettname());
		return repository.save(existingfaculty);
	}
}


