package com.tom;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis =new FileInputStream("chance.txt");
			InputStreamReader isr =new InputStreamReader(fis);
			BufferedReader in =new BufferedReader(isr);
			String s =in.readLine();
			while(s !=null) {
				System.out.println(s);
				String[] chances =s.split(",");
				if(chances.length ==2) {
					System.out.println(chances[0]+"/"+chances[1]);
					int i= Integer.parseInt(chances[1]);
					s =in.readLine();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
