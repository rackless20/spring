package com.springcore.Exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	private static ApplicationContext context;
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		    context = new ClassPathXmlApplicationContext("com/springcore/Exam/Config.xml");
			Exam1 p1=(Exam1)context.getBean("exam");
			System.out.println(p1.getQuestion());
			System.out.println(p1.getAnswer());
			

	}

}
