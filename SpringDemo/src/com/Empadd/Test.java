package com.Empadd;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {  
  public static void main(String[] args) 
  {  
        
	  ApplicationContext app=new ClassPathXmlApplicationContext("anything.xml");
		Employee e=(Employee) app.getBean("e");
		e.show();
  }  
}  