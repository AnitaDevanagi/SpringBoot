package com.anita.SpringBootProject.ServiceLayer;

import com.anita.SpringBootProject.dto.Detailsdto;
import com.anita.SpringBootProject.dto.Logindto;

public interface CommonService {
	
	public String validateandSave(Detailsdto dto);
	
	public String validateandlogin(Logindto login);
	
	
}
