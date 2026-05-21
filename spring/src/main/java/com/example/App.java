package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.Config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // laptop laptop = context.getBean(laptop.class);
        // laptop.compile();

          
        // System.out.println( "Hello World!" );
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Alein obj = (Alein) context.getBean("alien");
        obj.code();
    }
}
