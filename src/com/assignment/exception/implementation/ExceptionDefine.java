package com.assignment.exception.implementation;

public class ExceptionDefine {

	public static void main(String[] args) {
		int[] numbers = {3,5,54,457,345,32,};

		try {
			// Accessing element at index 5, which is out of bounds
			int number = numbers[6];
			System.out.println("Element at index 6: " + number);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException!");
			System.out.println("Error message: " + e.getMessage());
			System.out.println("Stack trace:");
			e.printStackTrace();
		}
	}
}
