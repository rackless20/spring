package clnj.clnj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context1 = new ClassPathXmlApplicationContext("Config.xml");
        Employee e1 = (Employee)context1.getBean("ee1");
        System.out.println(e1);
    }
    }
