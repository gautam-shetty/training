//thread - join

package com.thread.day13;

public class Day13task4 extends Thread {

	@Override
	public void run() {
		System.out.println("RUN " + Thread.currentThread().getPriority());

		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("run " + i);
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("main starts");

		Day13task4 td = new Day13task4();
		td.start();
		try {
			td.join(5000); //will pause main thread for 5 sec if this argument is given.
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("MAIN END");

	}

}
