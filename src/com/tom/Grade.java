package com.tom;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your english score:");
		try {
			int english =sc.nextInt();
			
		}catch(ArithmeticException e){
			System.out.print("the score between 0 to 100");
		}catch(NumberFormatException e){
			System.out.print("the wrong format");
		}
		System.out.print("enter your math score:");
		try {
			int math =sc.nextInt();
			
		}catch(ArithmeticException e){
			System.out.print("the score between 0 to 100");
		}catch(NumberFormatException e){
			System.out.print("the wrong format");
		}
	}

}
