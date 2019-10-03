//thread priority

package com.thread.day13;

public class Day13task3 extends Thread {
	
	@Override
	public void run()
	{
	System.out.println("RUN "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {


		// t.setPriority(9);

		// System.out.println(Thread.MAX_PRIORITY);
		// System.out.println(Thread.NORM_PRIORITY);
		// System.out.println(Thread.MIN_PRIORITY);

		Thread.currentThread().setPriority(8);

		Day13task3 t=new Day13task3();		//takes the default value of main thread
		t.start();
		System.out.println("MAIN p "+Thread.currentThread().getPriority());

	}

}
