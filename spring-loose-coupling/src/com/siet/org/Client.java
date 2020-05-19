//object type injection
package com.siet.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Student s=new Student();
		Teacher th=new Teacher();
		s.setT(th);
		s.teaching();	*/
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		//System.out.println("beans.xml is loaded");
		Student student=context.getBean("stu",Student.class);
		student.cheating();
		

}
}