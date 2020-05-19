package com.siet.org;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		//System.out.println("conig loaded");
		Sim sim=context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
		}

}
