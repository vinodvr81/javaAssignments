package com.assignments.five;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInsertionUsingCollections {

	public static void main(String[] args) {

		ArrayList<Integer> array_numbers = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter 10 numbers:");

		for (int i = 0; i < 10; i++) {
			int number = scanner.nextInt();
			array_numbers.add(number);
		}

		// Display the numbers that were tored in array list in the ArrayList
		System.out.println("Numbers in the ArrayList:");
		for (int number : array_numbers) {
			System.out.println(number);
		}

		scanner.close();
	}
}
