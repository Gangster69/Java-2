package com.tom;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer , Integer> r =new HashMap<>();
		 Random random = new Random();
		 for(int i=0 ;i<10000 ;i++) {
			 int number = random.nextInt(20);
			 Integer freq =r.get(number);
			 if(freq == null) {
				 r.put(number, 1);
			 }
			 else {
				 r.put(number,freq+1);
				 } 
		 }
		 System.out.println(r);
	}

}
