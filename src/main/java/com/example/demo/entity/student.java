package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Student_id;
	private int sem_id;
	private String sname;
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(int student_id, int sem_id, String sname) {
		super();
		Student_id = student_id;
		this.sem_id = sem_id;
		this.sname = sname;
	}
	
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSem_id() {
		return sem_id;
	}
	public void setSem_id(int sem_id) {
		this.sem_id = sem_id;
	}
	
	
}