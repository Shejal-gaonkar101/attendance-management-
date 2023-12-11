package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.student;
import com.example.demo.repository.studentrepository;


@Service
public class studentservice {
	@Autowired
	private studentrepository repository;
	
	public student savestudent(student stnt) {
		return repository.save(stnt);      // take argument as student obj and save it//post method
	}
	public List<student> savestudents(List<student> stnt) {
		return repository.saveAll(stnt);      // take list of students argument as student obj and save it//post method
	}
	public List<student> getstudents(){
		return repository.findAll();
	}
	public student getstudentById(int student_id){
		return repository.findById(student_id).orElse(null);
	}
	public student getstudentBysname(String sname){
		return repository.findBysname(sname);
	}
	public student getstudentById1(int sem_id){
		return repository.findById(sem_id).orElse(null);
	}
	public String deletestudent(int student_id) {
		repository.deleteById(student_id);
		return "deleted" +student_id;
	}
	   public student updatestudent(student stnt ) {
		student existingstudent=repository.findById(stnt.getStudent_id()).orElse(null);
		existingstudent.setSname(stnt.getSname());
		existingstudent.setSem_id(stnt.getSem_id());
		return repository.save(existingstudent);
	}
	
	
	
}
