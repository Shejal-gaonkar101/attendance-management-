package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="checking")
public class checking {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ukey;
	private int sub_id;
	private int sem_id;
	private int faculty_id;
	private String yesno;
	private Date date;
	public checking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public checking(int ukey, int sub_id, int sem_id, int faculty_id, String yesno, Date date) {
		super();
		this.ukey = ukey;
		this.sub_id = sub_id;
		this.sem_id = sem_id;
		this.faculty_id = faculty_id;
		this.yesno = yesno;
		this.date = date;
	}
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getUkey() {
		return ukey;
	}
	public void setUkey(int ukey) {
		this.ukey = ukey;
	}
	public int getSub_id() {
		return sub_id;
	}
	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}
	public int getSem_id() {
		return sem_id;
	}
	public void setSem_id(int sem_id) {
		this.sem_id = sem_id;
	}
	public int getFaculty_id() {
		return faculty_id;
	}
	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
	}
	public String getYesno() {
		return yesno;
	}
	public void setYesno(String yesno) {
		this.yesno = yesno;
	}
}
