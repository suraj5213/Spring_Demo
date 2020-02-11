package com.suraj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suraj.bean.Student;

public class TestCI {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Student student = (Student) context.getBean("studentCI");
		
//		Student student = new Student(111,"suraj");
		
		System.out.println(student);
		
	}

}
