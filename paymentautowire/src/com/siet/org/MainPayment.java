package com.siet.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	UPIPayments upi=context.getBean("upi",UPIPayments.class);
	upi.pay();
	
	

	}

}
