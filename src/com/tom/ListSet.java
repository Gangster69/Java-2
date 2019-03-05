package com.tom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> student =new HashSet<String>();
		student.add("Kevin,1230,age=11");
		student.add("Emma,0228,age=15");
		student.add("jmmy ,0512,age=9");
		student.add("Amy ,0711 ,age=11");
		student.add("Kevin,1230,age=11");
		System.out.print(student);
		
		System.out.println();
		
		List<String> dailyaccounting =new ArrayList<>();
		dailyaccounting.add("breakfast,50");
		dailyaccounting.add("coffee,30");
		dailyaccounting.add("lunch,100");
		dailyaccounting.add("coffee,30");
		dailyaccounting.add("dinner,200");
		System.out.print(dailyaccounting);
		
	}

}
