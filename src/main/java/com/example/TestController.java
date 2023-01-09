package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping(value = "/student1")
	public StudentDto student1() {
		StudentDto student1 = new StudentDto();
		student1.setName("yuna");
		student1.setAge(20);
		student1.setJavaGrade("A+");
		student1.setOracleGrade("C");
		
		System.out.println("객체정보 : " + student1.toString());
		return student1;
	}
	
	@GetMapping(value = "/student2")
	public StudentDto student2() {
		StudentDto student2 = new StudentDto();
		student2.setName("jimin");
		student2.setAge(21);
		student2.setJavaGrade("B+");
		student2.setOracleGrade("F");
		
		System.out.println("객체정보 : " + student2.toString());
		return student2;
	}
}
