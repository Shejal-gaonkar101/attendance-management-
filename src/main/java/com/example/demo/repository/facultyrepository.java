package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.faculty;
@Repository
public interface facultyrepository extends JpaRepository <faculty,Integer>{

	//faculty findBytname(String tname);

	faculty findBytname(String tname);


}
