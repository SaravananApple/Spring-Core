package com.example.SpringCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext factory = new ClassPathXmlApplicationContext("SpringCore.xml");

    	Student obj = factory.getBean(Student.class);
    	obj.display();
    }

}
