//setter dependency injection
package com.siet.org;

public class Student {
	private int id;
	private String studentName;
	
	
	public void setId(int id) {
		this.id = id;
		System.out.println("Setter method called: "+":setId");
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("Setter method called: "+":setStudentName");
	}


	public void displayStudentInfo()
	{
		System.out.println("student name is: "+studentName +" and the id is:"+id);
	}

}
