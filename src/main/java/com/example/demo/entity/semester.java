package com.example.demo.entity;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="semester")
public class semester {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sem_id;
	public semester() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String name;
	private Date start;
	private Date end;

	public semester(int sem_id, String name, Date start, Date end) {
		super();
		this.sem_id = sem_id;
		this.name = name;
		this.start = start;
		this.end = end;
	}
	
	public int getSem_id() {
		return sem_id;
	}
	public void setSem_id(int sem_id) {
		this.sem_id = sem_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}

	public static boolean isPresent() {
		// TODO Auto-generated method stub
		return false;
	}
}
	



