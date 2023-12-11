package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.semester;
import com.example.demo.entity.subject;
import com.example.demo.repository.semesterrepository;
import com.example.demo.repository.subjectrepository;

@Service
public class subjectservice {
	@Autowired
	private subjectrepository repository;
     
	public subject savesubject(subject sub) {
		 return repository.save(sub);
	}
	public List<subject> savesubjects(List<subject> sub) {
		 return repository.saveAll(sub);
	}
	public List<subject> getsubjects(){
		return repository.findAll();
		
	}
	public subject  getsubjectById(int sub_id ){
		return (repository.findById(sub_id).orElse(null));
		
	}
	public subject  getsubjectBysubname(String subname ){
		return repository.findBysubname(subname);
		
	}
	public subject  getsubjectById1(int faculty_id ){
		return repository.findById(faculty_id).orElse(null);
		
	}
	public subject getsubjectById2(int sem_id ){
		return repository.findById(sem_id).orElse(null);		
	}
	
	public String deletesubject(int sub_id) {
		repository.deleteById(sub_id);
		return " deleted"+sub_id;
		
	}
	public subject updatesubject(subject sub){
		subject existingsubject=(repository.findById(sub.getSem_id()).orElse(null));
		existingsubject.setSubname(sub.getSubname());
		existingsubject.setFaculty_id(sub.getFaculty_id());
		existingsubject.setSem_id(sub.getSem_id());
		return repository.save(existingsubject);
		
	}
	
	
}



