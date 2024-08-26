package com.example.glab3054._a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.perscholas.controller.EmployeeController;

@SpringBootApplication
public class Application {

	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
		EmployeeController e = new EmployeeController();
		//e.createEmployeeTable();
		//e.findEmployeeByname();
		//e.findEmployeeById();
		e.ShowOfficeCodes_AsDepartment();
	}

}

}
