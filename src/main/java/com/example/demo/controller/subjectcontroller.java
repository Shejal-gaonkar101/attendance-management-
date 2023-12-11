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
import com.example.demo.entity.subject;
import com.example.demo.service.semesterservice;
import com.example.demo.service.subjectservice;
@RestController
public class subjectcontroller {
	@Autowired
	private subjectservice service;
	
	//@PostMapping("/addsubject")
	public subject addsubject(@RequestBody subject sub ) {
		return service.savesubject(sub);
	}
	//@PostMapping("/addsubjects")
	public List<subject> addsubjects(@RequestBody List<subject> sub ) {
		return service.savesubjects(sub);
	}
	//@GetMapping("/subject")
    public List<subject> findAllsubjects(){
    	return service.getsubjects();
    }
    //@GetMapping("/subject/{sub_id}")
    public subject findsubjectById(@PathVariable int sub_id) {
    	return service.getsubjectById(sub_id);
    }
    //@GetMapping("/subject/{subname}")
    public subject findsubjectBysubname(@PathVariable String  subname) {
    	return service.getsubjectBysubname(subname);
    }
    //@GetMapping("/subject/{faculty_id}")
    public subject findsubjectById1(@PathVariable int faculty_id) {
    	return service.getsubjectById1(faculty_id);
    }
   //@GetMapping("/subject/{sem_id}")
    public subject findsubjectById2(@PathVariable int sem_id) {
    	return service.getsubjectById2(sem_id);
    }
   // @PutMapping("/update/{subject}")
	public subject updatesubject(@RequestBody subject sub ){
		return service.updatesubject(sub);
    }
    //@DeleteMapping("/delete/{sub_id}")
    public String deletesubject(@PathVariable int sub_id){
    	return service.deletesubject(sub_id);
    }
}



