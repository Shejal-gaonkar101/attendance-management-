package com.example.demo.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.semester;
import com.example.demo.entity.checking;
@Repository
public interface checkingrepository  extends JpaRepository<checking, Integer> {

	//Optional<checking> findByname(String yes0no);

	checking findByyesno(String yesno);

	//update findByDate(int date);

	//update findBydate(int date);

	checking findBydate(Date date);

	//Optional<update> findByDate(int date);

	//Optional<update> findByname(String yes0no);

	//Optional<update> findByname(String yes0no);

}
