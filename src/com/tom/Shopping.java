package com.tom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Map<String, Integer> r =new HashMap<>();
		String product =null;
		int quantity =0;
		while(true){
			System.out.print("Enter:1.add 2.print");
			Scanner sc =new Scanner(System.in);
			int function =sc.nextInt();
			
		
			if(function == 1){
				System.out.println("Enter the name of product:");
				product =sc.nextLine();
				sc.nextLine();
				System.out.println("Enter the quantity :");
				quantity =sc.nextInt();
				r.put(product, quantity);
			}
			if(function == 2){
				System .out .println(r);
				break;
			}
			else if(function !=1 && function !=2 ){
				System.out.println("Bye!");
			}
		}
	}

}
