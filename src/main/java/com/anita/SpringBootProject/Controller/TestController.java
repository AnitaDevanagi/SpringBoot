package com.anita.SpringBootProject.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anita.SpringBootProject.REntity.Myapp_Register;
import com.anita.SpringBootProject.ServiceLayer.CommonService;
import com.anita.SpringBootProject.dto.Detailsdto;
import com.anita.SpringBootProject.dto.Logindto;
import com.anita.SpringBootProject.repository.Repositorydetail;

@RestController
public class TestController {
	Logger log = LoggerFactory.getLogger(TestController.class);
	@Autowired
	private CommonService service;
	
    @Autowired
	private Repositorydetail repositorydetail;
	 @GetMapping(value = "/hello")
	  public String hello() {
		 Myapp_Register details =repositorydetail.getByEmail("anitasddevanagi1@gmail.com");
		System.out.println(details);
		Myapp_Register  details2 = repositorydetail.getByContact("911070101");
		log.info(""+ details2);
		 return "Hi java"; 	
	   }
	 
	 @PostMapping(value = "/register")
	 public String save(@RequestBody Detailsdto dto) {
		String msg=service.validateandSave(dto);
		System.out.println(msg);
		return msg;
		 
		}
	 
	 @PostMapping(value="/login")
	 public String login( @RequestBody  Logindto login) {
		String respose = service.validateandlogin(login);
		System.out.println(respose);
		return "Login Successfully";
		 
	 }
	 
	  
	

}
