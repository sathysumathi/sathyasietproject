//Constructor dependency injection
package com.siet.org;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	Student s=context.getBean("student",Student.class);
	s.displayStudentInfo();
	
	}

}
