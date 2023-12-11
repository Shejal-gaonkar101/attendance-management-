package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.student;
@Repository
public interface studentrepository extends JpaRepository<student,Integer>{

	student findBysname(String sname);

	//Optional<student> findBySname(String sname);

	//Optional<student> findBysname(String sname);

	//Optional<student> findBysem_id(String sem_id);

	//Optional<student> findById(String sem_id);


	//Optional<student> findByStudent_id(int Student_id);

	//Optional<student> findByStudent_id(int student_id);

}
