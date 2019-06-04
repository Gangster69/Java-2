package com.tom;

public class Breakfast extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Cooking breakfast");
			Thread.sleep(5000);
			System.out.println("Breakfast done!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
