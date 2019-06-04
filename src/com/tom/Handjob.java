package com.tom;

public class Handjob implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Handjob");
			Thread.sleep(3000);
			System.out.println("Happy");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
