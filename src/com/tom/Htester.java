package com.tom;

public class Htester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse h1 =new Horse("H1:");
		//h1.setName("H1:");
		h1.start();
		
		Horse h2 =new Horse("H2:");
		//h2.setName("H2:");
		h2.start();
		//
		/*HorseRunnable h1 =new HorseRunnable();
		Thread thread =new Thread(h1);
		thread.start();*/
		
		System.out.println("END!");
	}

}
