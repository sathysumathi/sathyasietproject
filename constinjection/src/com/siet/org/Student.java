//constructor dependency injection
package com.siet.org;

public class Student {
	private int id;
	private String studentName;
	
	//constructor for only one variable lets take it as id
	public Student(int id)
	{
		this.id=id;
	}

	public Student(int id, String studentName) {
		
		this.id = id;
		this.studentName = studentName;
	}



	public void displayStudentInfo()
	{
		System.out.println("student name is: "+studentName +" and the id is:"+id);
	}

}
