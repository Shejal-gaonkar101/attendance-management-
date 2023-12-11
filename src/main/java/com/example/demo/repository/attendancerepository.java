package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.attendance;
import com.example.demo.entity.semester;

public interface attendancerepository extends JpaRepository<attendance, Integer>{

	//Optional<attendance> findById1(int ukey);

	//Optional<attendance> findById2(int student_id);

	//Optional<attendance> findById3(int status);

}
