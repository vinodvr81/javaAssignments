package com.assigments.todo;

public class QueueMain {
	public static void main(String[] args) {
		Queue queue = new QueueImplementation(5);

		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);
		queue.insert(50);
		queue.insert(60);

		queue.delete();
		queue.delete();

		queue.insert(60);
		queue.insert(70);

		while (!queue.isEmpty()) {
			queue.delete();
		}

		queue.delete(); 
	}
}