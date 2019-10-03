//simple thread
package com.thread.day13;

public class Day13task1 extends Thread {
	
	@Override
	public void run() {
		System.out.println("Run Thread name: "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		Day13task1 t1=new Day13task1();
		
		System.out.println("Main Thread name: "+Thread.currentThread().getName());
		t1.start();
		t1.run();

	}

}
