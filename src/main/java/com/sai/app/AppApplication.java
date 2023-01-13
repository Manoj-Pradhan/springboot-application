package com.sai.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext app = SpringApplication.run(AppApplication.class, args);

		 StudentName studentname = app.getBean(StudentName.class);
		 StudentRoll studentroll = app.getBean(StudentRoll.class);
		 StudentFee studentfee = app.getBean(StudentFee.class);

		studentname.setName("sai");
		System.out.println("Student Name is : "+studentname.getName());
		
		studentroll.setRoll(100);
		System.out.println("Student Roll is : "+studentroll.getRoll());

		studentfee.setName(7000.00);
		System.out.println("Student Fee is : "+studentfee.getFee());
	}

}
