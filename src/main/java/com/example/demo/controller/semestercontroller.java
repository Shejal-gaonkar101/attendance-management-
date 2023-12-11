package com.example.demo.controller;

import java.util.Date;
//import java.sql.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.semester;
import com.example.demo.exception.errorobject;
import com.example.demo.exception.notfoundexception;
import com.example.demo.service.semesterservice;
import com.example.demo.utility.globalresources;

@RestController
public class semestercontroller {
	
	private Logger logger = globalresources.getlogger(semestercontroller.class);
	@Autowired
	private semesterservice service;
	//Logger logger =LoggerFactory.getLogger(semestercontroller.class);
	//@PostMapping("/addsemester")
	public  semester addsemester(@RequestBody semester seme ) {
		String methodname="addsemester()";
		logger.info(methodname+"called");
		 return service.savesemester(seme);
	}
	//@PostMapping("/addsemesters")
	public List<semester> addsemesters(@RequestBody List<semester> seme ) {
		return service.savesemesters(seme);
	}
	//@GetMapping("/semester")
    public List<semester> findAllsemesters(){
    	return service.getsemesters();
    }
   
    //@GetMapping("semester/{sem_id}")
    public semester findsemesterById(@PathVariable int sem_id) {           //handler method to catch exception
	 return service.getsemesterById(sem_id);
	}
    @ExceptionHandler
    public ResponseEntity<errorobject> handleException (notfoundexception ex  ){
    	errorobject eobj =new errorobject(HttpStatus.NOT_FOUND.value(),ex.getMessage(),System.currentTimeMillis());
    	return new  ResponseEntity<errorobject>(eobj , HttpStatus.NOT_FOUND);
    }
    
    
    //  @GetMapping("/semester/{name}")
    public semester findsemesterByName(@PathVariable String  name) {
    	return service.getsemesterByName(name);
    }
  // @GetMapping("/semester/{start_date}")
    public semester findsemesterBystart(@PathVariable Date start) {
    	return service.getsemesterBystart(start);
    }
    //@GetMapping("/semester/{to_date}")
    public semester findsemesterByend(@PathVariable Date  end) {
    	return service.getsemesterByend(end);
    }
    //@PutMapping("/update/{sem_id}")
	public semester updatesemester(@RequestBody semester seme ){
		return service.updatesemester(seme);
    }
   
	//@DeleteMapping("/delete/{sem_id}")
    public String deletesemester(@PathVariable int sem_id){
    	//String deletesemester = new String();
    	//if(deletesemester){
    		//service.deletesemester(sem_id);
    		//return ("sem is deleted",HttpStatus.OK);    		
    	///}
    	//else
    	//{
           //throw new Exception();
    	//}
    	return service.deletesemester(sem_id);
    }
    
    
}
