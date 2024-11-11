package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.Dao.EmpDao;
import com.spring.jdbc.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext c;
	public static void main( String[] args )
    {
//      System.out.println( "Hello World!" );
    	
    	c = new ClassPathXmlApplicationContext("com/spring/jdbc/Config.xml");
    	EmpDao cd = c.getBean("EmpDao",EmpDao.class);
    	
    	Employee c1 = new Employee();
    	/*c1.setEid(112);
    	c1.setEname("Hetvi");
    	c1.setDname("Developer");
    	int r = cd.insert(c1);
    	
    	System.out.println("Record inserted" +r);
    	*/
    	//c1.setEid(101);
    	//c1.setEname("hetvi pandya");
    //int c=cd.update(c1);
    //System.out.println("record update+ c");
    
       //c1.setEid(101);
  //int C=cd.delete(c1);
   //System.out.println("record delete+ c");
    	
    Employee c=cd.getEmployee(102);
   	System.out.println(c);
    	
    /*	List<Employee> employee=EmpDao.getAllEmp();
    	for(Employee c2:employee)
    	{
    		System.out.println(c2);
    		 
    	}*/
    
    }
}
