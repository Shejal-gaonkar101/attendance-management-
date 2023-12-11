package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.subject;
import com.example.demo.entity.checking;
import com.example.demo.service.subjectservice;
import com.example.demo.service.checkingservice;
@RestController
public class checkingcontroller {
	
	@Autowired
	private checkingservice service;
	
	//@PostMapping("/addchecking")
	public checking addchecking(@RequestBody checking up ) {
		return service.savechecking(up);
	}
	//@PostMapping("/addcheckings")
	public List<checking> addcheckings(@RequestBody List<checking> up ) {
		return service.savecheckings(up);
	}
	//@GetMapping("/checking")
    public List<checking> findAllcheckings(){
    	return service.getcheckings();
    }
    //@GetMapping("/checking/{ukey}")
    public checking findcheckingById(@PathVariable int ukey) {
    	return service.getcheckingById(ukey);
    }
    //@GetMapping("/checking/{sub_id}")
    public checking findcheckingById1(@PathVariable int  sub_id) {
    	return service.getcheckingById1(sub_id);
    }
    //@GetMapping("/checking/{sem_id}")
    public checking findcheckingById2(@PathVariable int sem_id) {
    	return service.getcheckingById2(sem_id);
    }
    //@GetMapping("/checking/{faculty_id}")
    public checking findcheckingById3(@PathVariable int faculty_id) {
    	return service.getcheckingById3(faculty_id);
    }
    //@GetMapping("/checking/{yesno}")
    public checking findcheckingByyesno(@PathVariable String  yesno) {
    	return service.getcheckingByyesno(yesno);
     }
    //@GetMapping("/checking/{date}")
    public checking findcheckingBydate(@PathVariable Date date) {
    	return service.getcheckingBydate(date);
    }
   // @PutMapping("/update/{ukey}")
	public checking updatechecking(@RequestBody checking up ){
		return service.updatechecking(up);
    }
    //@DeleteMapping("/delete/{ukey}")
    public String deletechecking(@PathVariable int ukey){
    	return service.deletechecking(ukey);
    }
}






