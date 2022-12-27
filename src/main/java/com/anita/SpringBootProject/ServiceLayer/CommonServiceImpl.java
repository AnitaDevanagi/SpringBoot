package com.anita.SpringBootProject.ServiceLayer;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anita.SpringBootProject.Exception.InvalidEmailException;
import com.anita.SpringBootProject.Exception.InvalidPasswordException;
import com.anita.SpringBootProject.REntity.Myapp_Register;
import com.anita.SpringBootProject.dto.Detailsdto;
import com.anita.SpringBootProject.dto.Logindto;
import com.anita.SpringBootProject.repository.Repositorydetail;




@Service
public class CommonServiceImpl implements CommonService{
    @Autowired
	private Repositorydetail repository;
   
	public String validateandSave(Detailsdto dto) {
		if(dto.getEmail()!= null && !dto.getEmail().isEmpty()) {
			if(dto.getPassword()!=null &&!dto.getPassword().isEmpty()) {
				if(dto.getConfirmpassword()!=null &&!dto.getConfirmpassword().isEmpty()&&dto.getConfirmpassword().equals(dto.getPassword())) {
					Myapp_Register register =new Myapp_Register();
					register.setPassword(dto.getPassword());
					register.setEmail(dto.getEmail());
					register.setName(dto.getName());
					register.setContact(dto.getContact());
					repository.save(register);
				}else {
					 throw new InvalidPasswordException ("Invalid Confirmpassword ");
				}
				
			}else {
			  throw new InvalidPasswordException ("Invalid password");
			}
			
		}else {
			throw new InvalidEmailException();
		}
			
		return "data Saved";
	}

	@Override
	public String validateandlogin(Logindto login) {
		if(login.getEmail()!=null && !login.getEmail().isEmpty()) {
			if(login.getPassword()!=null && !login.getPassword().isEmpty()) {
				Myapp_Register register=repository.getByEmail(login.getEmail());
			 if(register.getEmail().equals(login.getEmail()) && register.getPassword().equals(login.getPassword())) {
				 return "Login Successfully";
			 }else {
					throw new InvalidPasswordException ("Invalid Email and password");
				}
			
			}else {
				throw new InvalidPasswordException ("Invalid password");
			}
			
		}else {
			throw new InvalidEmailException();
		}
		
		
		
	}
	
	}		
		
	
		