package com.tom;

public class Horse extends Thread{
	public Horse(String name) {
		setName(name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=100; i++) {
			StringBuilder sb =new StringBuilder();
			for(int j=0; j<i; j++) {
				sb.append(" ");
			}
			System.out.println(getName()+sb.toString()+i);
			/*try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}
	

}
