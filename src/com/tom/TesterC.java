package com.tom;

public class TesterC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wake up!");
		Breakfast breakfast =new Breakfast();
		breakfast.start();
		
		Handjob handj =new Handjob();
		Thread thread =new Thread(handj);
		thread.start();
		
		try {
			thread.join();
			breakfast.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main end!");
	}

}
