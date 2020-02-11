package com.suraj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suraj.bean.Person;

public class TestPerson {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Person person = context.getBean("person",Person.class);
		
		System.out.println(person);
		
	}

}
