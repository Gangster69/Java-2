package com.tom;

public class Wizard extends Thread{
	
	public void Thunder() {
		try {
			System.out.println("Thunder Start");
			Thread.sleep(2000);
			System.out.println("Thunder End!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wizard w1 =new Wizard();
		w1.start();
		Wizard w2 =new Wizard();
		w2.start();
	}

}
