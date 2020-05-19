package com.siet.org;

public class Student {
	private int id;
	private MathCheat t;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setT(MathCheat t) {
		this.t = t;
	}

	public void cheating()
	{
		
		t.cheat();
		System.out.println("hey my id is:"+id);
	}
	
}
