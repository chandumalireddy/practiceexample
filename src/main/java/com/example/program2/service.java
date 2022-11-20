package com.example.program2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class service {


	public service() {
		super();
		System.out.println("object created for service");
	
	}
	
	public String aa() {
		return "aa creted";
		
		
	}
	
}
