//thread syncronization
package com.thread.day13;

class BankAccount {

	public void withdraw() { // or can be public synchronized void withdraw()
		System.out.println("test " + Thread.currentThread().getName());

		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println(Thread.currentThread().getName() + " " + i);
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class Thread1 implements Runnable {

	BankAccount bankAccount;

	public Thread1(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public void run() {
		bankAccount.withdraw();
	}
}

public class Day13task5 {

	public static void main(String[] args) {

		BankAccount bnkIC01 = new BankAccount();
		BankAccount bnkIC02 = new BankAccount();
		Thread1 t1 = new Thread1(bnkIC01);
		Thread1 t2 = new Thread1(bnkIC02);

		Thread ATM1 = new Thread(t1, "ATM1");
		Thread ATM2 = new Thread(t1, "ATM2");

		Thread otherATM = new Thread(t2, "otherATM");

		ATM1.start();
		ATM2.start();
		otherATM.start();

	}

}
