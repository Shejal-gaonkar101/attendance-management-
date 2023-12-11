package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.semester;
import com.example.demo.entity.subject;
@Repository
public interface subjectrepository extends JpaRepository<subject, Integer>{

	//subject findBySubname(String subname);

	subject findBysubname(String subname);

	//subject findByName(String sub_name);

	//subject findBysub_name(String sub_name);

	//subject findBySub_name(String subname);

	//subject findByName(String sub_name);

	//subject findById1(int faculty_id);

	//subject findById2(int sem_id);

	//Optional<subject> findById1(int faculty_id);

	//Optional<subject> findById2(int sem_id);

	//subject findById2(int sem_id);

	//subject findById1(int faculty_id);

	//subject findByfaculty_id(int faculty_id);

	//subject findBysem_id(int sem_id);

	//subject findByFaculty_id(int faculty_id);

	//subject findBySem_id(int sem_id);

}
