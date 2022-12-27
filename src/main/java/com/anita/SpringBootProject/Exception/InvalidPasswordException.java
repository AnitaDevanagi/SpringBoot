package com.anita.SpringBootProject.Exception;

public class InvalidPasswordException extends RuntimeException {
  
	public InvalidPasswordException (String msg){
		super(msg);
	}
}
