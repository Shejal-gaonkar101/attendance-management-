package com.example.demo.service;

import java.sql.Date;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.semester;
import com.example.demo.exception.notfoundexception;
import com.example.demo.repository.semesterrepository;

import com.example.demo.service.semesterservice;
import com.example.demo.utility.globalresources;
@Service 
public class semesterservice {
	private Logger logger=globalresources.getlogger(semesterservice.class);
	@Autowired
	private semesterrepository repository;
     
	public semester savesemester(semester seme) {
		String methodname="addsemester()";
		logger.info(methodname+"called");
		//if(semester.isPresent()) {
			//throw new notfoundexception("this sem already exists");
			//}
		 return repository.save(seme);
	}
	public List<semester> savesemesters(List<semester> seme) {
		 return repository.saveAll(seme);
	}
	public List<semester> getsemesters(){
		return repository.findAll();
		
	}
	public  semester  getsemesterById(int sem_id ){
	if(!semester.isPresent()) {
		throw new notfoundexception("sem not found");
		}
		return (repository.findById(sem_id).orElse(null));
		
	}
	public semester  getsemesterByName(String name ){
		return repository.findByName(name);
		
	}
	public semester  getsemesterBystart(java.util.Date start){
		return repository.findBystart(start);
		
	}
	public semester  getsemesterByend(java.util.Date end ){
		return repository.findByend(end);
		
	}
	
	public String deletesemester(int sem_id) {
		repository.deleteById(sem_id);
		return " deleted"+sem_id;
		
	}
	public semester updatesemester(semester semes){
		semester existingsemester=(repository.findById(semes.getSem_id()).orElse(null));
		existingsemester.setName(semes.getName());
		existingsemester.setStart(semes.getStart());
		existingsemester.setEnd(semes.getEnd());
		return repository.save(existingsemester);
		
	
	}


	//
	
}
	

