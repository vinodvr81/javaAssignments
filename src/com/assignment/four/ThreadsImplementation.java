package com.assignment.four;

class ThreadsImplementation implements Runnable {

	@Override
	public void run() {
		System.out.println("Tables of 5:");
		for (int i = 1; i <= 10; i++) {
			System.out.println("5 x " + i + " = " + (5 * i));
		}
	}

}
