package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		Random random =new Random();
		int price = random.nextInt(100000000);
		System.out.println(price);
		System.out.print("how many people to share:");
		Scanner sc =new Scanner(System.in);
		int n=0;
		try {
			int number =sc.nextInt();
			n =price/number;
		}
		catch(ArithmeticException e){
			System.out.print("enter the right number");
		}
		catch(NumberFormatException e){
			System.out.print("enter the right number");
		}
		System.out.print("you can have "+n+" dollar");

	}

}
