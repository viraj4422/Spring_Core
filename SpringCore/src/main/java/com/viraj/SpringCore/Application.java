package com.viraj.SpringCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {

	@Bean
	public Student getStudent(){
		
		return new Student("viraj");
	}
}
