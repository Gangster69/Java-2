package com.tom;

public class Student {
	String name;
	protected int english;
	// private ���}��   ; protected �}�� ; �S�� �u��b�ۦP package �ϥ�
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
	//setter �O�@��ƪ���k 
}
