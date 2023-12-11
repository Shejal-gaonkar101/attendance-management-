package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="attendance")
public class attendance {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int attendance_id;
	private int ukey;
    private int Student_id;
    private int status;
	public attendance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public attendance(int attendance_id, int ukey, int student_id, int status) {
		super();
		this.attendance_id = attendance_id;
		this.ukey = ukey;
		Student_id = student_id;
		this.status = status;
	}
	public int getAttendance_id() {
		return attendance_id;
	}
	public void setAttendance_id(int attendance_id) {
		this.attendance_id = attendance_id;
	}
	public int getUkey() {
		return ukey;
	}
	public void setUkey(int ukey) {
		this.ukey = ukey;
	}
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
