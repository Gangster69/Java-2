package com.tom;

public class people {
	String id ; 
	int age;
	int birthday ;
	
	public people(String id ,int age ,int birthday) {
		this.id =id;
		this.age =age;
		this.birthday =birthday;
		
	}

	public void print() {
		System.out.println(id+"\t"+age+'\t'+birthday);
	}
	
	public void setId(String id) {
		this.id =id;
	}
}
