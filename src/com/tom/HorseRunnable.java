package com.tom;

public class HorseRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=1000; i++) {
			System.out.println("Horse 1:"+i);
		}
	}
	
}
