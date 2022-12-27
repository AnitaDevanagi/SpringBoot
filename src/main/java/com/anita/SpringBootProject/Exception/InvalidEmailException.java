package com.anita.SpringBootProject.Exception;

public class InvalidEmailException extends RuntimeException{
	
	public InvalidEmailException(){
		super("Invalid email id");
		
	}

}
