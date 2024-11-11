package com.springcore.aw.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/aw/annotation/config.xml");
		Question q1=(Question)context.getBean("q1");
	    System.out.println(q1);
	}

}
