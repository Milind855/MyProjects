package com.mypro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Appclass
{
	public static void main(String[] args) 
	{
		
		ApplicationContext app=new ClassPathXmlApplicationContext("anything.xml");
		Employee e=(Employee) app.getBean("e");
		e.show();
	}

}
