package com.example.demo.repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.semester;
@Repository
public interface semesterrepository extends JpaRepository<semester, Integer>{

     semester findByName(String name);

	//semester findByDate(Date from);

	//semester findByDate1(Date to);

	semester findBystart(java.util.Date start);

	semester findByend(java.util.Date end);

	//semester findByDate(Date from);

	//semester findByDate1(Date to);

	//Optional<semester> findByDate1(Date from);

	//Optional<semester> findByDate2(Date to);

	//semester findByDate(Date from);

	//semester findByDate(Date from);

	//semester findByDate(Date to);

	//semester findByDate(Date from);

	//semester findByfrom(String from);

	//semester findByto(String to);

	
}
