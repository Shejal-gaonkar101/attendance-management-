package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subject")
public class subject {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sub_id;
	private String subname;
	private int faculty_id;
	private int sem_id;
	public subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public subject(int sub_id, String subname, int faculty_id, int sem_id) {
		super();
		this.sub_id = sub_id;
		this.subname = subname;
		this.faculty_id = faculty_id;
		this.sem_id = sem_id;
	}
	
	public int getSub_id() {
		return sub_id;
	}
	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public int getFaculty_id() {
		return faculty_id;
	}
	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
	}
	public int getSem_id() {
		return sem_id;
	}
	public void setSem_id(int sem_id) {
		this.sem_id = sem_id;
	}
	

}
