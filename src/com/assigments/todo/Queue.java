package com.assigments.todo;

interface Queue {
	void insert(int data);

	int delete();

	boolean isEmpty();

	boolean isFull();
}
