package com.tom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> r =new ArrayList<>();
		Random rand =new Random();
		for(int i =0;i<20;i++) {
			r.add(0);
		}
		for(int i=0;i<10000;i++) {
			int number =rand.nextInt(20);
			int freq =r.get(number);
			r.set(number, freq+1);
		}
		System.out.println(r);
		
	}

}
