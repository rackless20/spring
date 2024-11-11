package com.springscore.el;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	private static ApplicationContext context;
	
	public static void main( String[]args )
	{
			// TODO Auto-generated method stub
			 context = new ClassPathXmlApplicationContext("com/springscore/el/Config.xml");
			Demo s1=(Demo)context.getBean("demo");
			System.out.println(s1);
			 

	}

}
