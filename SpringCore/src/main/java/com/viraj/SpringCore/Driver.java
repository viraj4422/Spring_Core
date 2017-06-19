package com.viraj.SpringCore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(Application.class);
		Student student=context.getBean(Student.class);
		student.tellName();
		context.close();
	}

}
