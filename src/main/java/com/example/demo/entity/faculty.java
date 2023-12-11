package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="faculty")

public class faculty {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int faculty_id;
	private String tname;
	public faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public faculty(int faculty_id, String tname) {
		super();
		this.faculty_id = faculty_id;
		tname = tname;
	}
	
	
	public int getFaculty_id() {
		return faculty_id;
	}
	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
	}
	public String gettname() {
		return tname;
	}
	public void settname(String tname) {
		this.tname = tname;
	}
	

}
