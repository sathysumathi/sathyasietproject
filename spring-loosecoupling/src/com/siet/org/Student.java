package com.siet.org;

public class Student {
	private Cheat ch;//interface class ref
	

public void setCh(Cheat ch) {
		this.ch = ch;
	}


public void cheating()
{
	ch.cheat();
	}
	
}