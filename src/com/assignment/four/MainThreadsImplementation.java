package com.assignment.four;

public class MainThreadsImplementation {

	public static void main(String[] args) {
		// Create a new thread for printing tables of 5
		Thread table_five = new Thread(new ThreadsImplementation());
		table_five.start();

		// Display 20 even numbers in the main thread
		System.out.println("Even numbers: =");
		for (int i = 1, count = 0; count < 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				count++;
			}
		}
	}
}