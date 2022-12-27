package com.anita.SpringBootProject.REntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="myapp_register")
public class Myapp_Register {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="contact")
	private String contact;
	@Column(name="password")
	private String password;
	@Column(name="otp")
	private int otp;
	
	
	
	
	

	
}
