package com.tom;

public class Student {
	String name;
	protected int english;
	// private 不開放   ; protected 開放 ; 沒打 只能在相同 package 使用
	public Student(String name , int english) {
		this.name =name;
		this.english =english;
	}
	
	public void print(){
		System.out.print(name +"\t" +english );
	}
	
	public void setEnglish(int english) {
		this.english =english;
	}
	//setter 保護資料的方法 
}
