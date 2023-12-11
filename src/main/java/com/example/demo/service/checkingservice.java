package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.subject;
import com.example.demo.entity.checking;
import com.example.demo.repository.subjectrepository;
import com.example.demo.repository.checkingrepository;
@Service
public class checkingservice {
	@Autowired
	private checkingrepository repository;
     
	public checking savechecking(checking up) {
		 return repository.save(up);
	}
	public List<checking> savecheckings(List<checking> up) {
		 return repository.saveAll(up);
	}
	public List<checking> getcheckings(){
		return repository.findAll();
		
	}
	public checking  getcheckingById(int ukey ){
		return (repository.findById(ukey).orElse(null));
		
	}
	public checking getcheckingById1(int sub_id ){
		return repository.findById(sub_id).orElse(null);
		
	}
	public checking getcheckingById2(int sem_id ){
		return repository.findById(sem_id).orElse(null);
		
	}
	public checking getcheckingById3(int faculty_id ){
		return repository.findById(faculty_id).orElse(null);		
	}
	
	public checking getcheckingByyesno(String yesno ){
		return repository.findByyesno(yesno);	
	}
	public checking getcheckingBydate(Date date ){
		return repository.findBydate(date);		
	}
	public String deletechecking(int up) {
		repository.deleteById(up);
		return " deleted"+up;
		
	}
	public checking updatechecking(checking up){
		checking existingchecking=(repository.findById(up.getUkey()).orElse(null));
		existingchecking.setSub_id(up.getSub_id());
		existingchecking.setSem_id(up.getSem_id());
		existingchecking.setFaculty_id(up.getFaculty_id());
		existingchecking.setYesno(up.getYesno());
		existingchecking.setDate(up.getDate());
		return repository.save(existingchecking);
		
	}
	
	
}






