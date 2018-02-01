package com.org;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext text=new ClassPathXmlApplicationContext("anything.xml");
		
		Vehicle t=(Vehicle) text.getBean("car");
		t.drive();
		
	}

}
