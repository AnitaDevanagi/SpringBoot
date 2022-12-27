package com.anita.SpringBootProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anita.SpringBootProject.REntity.Myapp_Register;



public interface Repositorydetail extends JpaRepository<Myapp_Register, Integer> {
	Myapp_Register getByEmail(String email);
	Myapp_Register getByContact(String phonenumber);
	
	
}