package com.suraj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suraj.bean.Employee;

public class TestEmployee {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Employee employee = context.getBean("employee",Employee.class);
		
		System.out.println(employee);
				
	}

}
