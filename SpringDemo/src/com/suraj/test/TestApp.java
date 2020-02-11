package com.suraj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suraj.bean.Student;

public class TestApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Student student = (Student) context.getBean("student");

		student.setRollno(101);
		student.setName("suraj");
		
		System.out.println(student);
		
	}

}
