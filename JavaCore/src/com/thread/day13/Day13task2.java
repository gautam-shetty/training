//thread intermediate
package com.thread.day13;

public class Day13task2 extends Thread {

	@Override
	public void run() {
		System.out.println("RUN " + Thread.currentThread().getName());

		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		Day13task2 t = new Day13task2();
		System.out.println("main starts");
		t.start();
		try {
			for (int i = 0; i < 10; i++) {

				System.out.println(i + " " + Thread.currentThread().getName());

				Thread.sleep(500);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("MAIN END");

	}

}
