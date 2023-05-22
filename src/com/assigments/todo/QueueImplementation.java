package com.assigments.todo;

class QueueImplementation implements Queue {

	private int[] queue;
	private int front;
	private int rear;
	private int size;

	public QueueImplementation(int data) {
		queue = new int[data];
		front = 0;
		rear = -1;
		size = 0;
	}

	@Override
	public void insert(int data) {
		if (isFull()) {
			System.out.println("Queue is full and therefore data cannot insert " + data);
			return;
		}

		rear = (rear + 1) % queue.length;
		queue[rear] = data;
		size++;
		System.out.println(data + " inserted into the queue");
	}

	@Override
	public int delete() {
		if (isEmpty()) {
			System.out.println("Queue is empty and therefore cannot delete element");
			return -1;
		}
		

		int deletedElement = queue[front];
		front = (front + 1) % queue.length;
		size--;
		System.out.println(deletedElement + " deleted from the queue");
		return deletedElement;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean isFull() {
		return size == queue.length;
	}
}