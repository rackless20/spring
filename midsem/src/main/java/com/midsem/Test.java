package com.midsem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    ApplicationContext cc=new ClassPathXmlApplicationContext("com/midsem/Config.xml");
		Custmor c1=(Custmor)cc.getBean("C1");
	    System.out.println(c1);
	    
	    //ApplicationContext c=new ClassPathXmlApplicationContext("com/midsem/config.xml");
 		Order o1=(Order)cc.getBean("O1");
 	    System.out.println(o1);
    
	}
}
