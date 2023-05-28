package com.assignments.five;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class StudentRecords {

	public static void main(String[] args) {
		Hashtable<String, Integer> student_records = new Hashtable<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 5 student records:");

		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter student name for record " + i + ": ");
			String name = scanner.nextLine();
			System.out.print("Enter marks for record " + i + ": ");
			int marks = scanner.nextInt();
			scanner.nextLine();
			student_records.put(name, marks);
		}

		String student_with_highest_marks = "";
		int highestMarks = Integer.MIN_VALUE;

		for (Map.Entry<String, Integer> entry : student_records.entrySet()) {
			String name = entry.getKey();
			int marks = entry.getValue();
			if (marks > highestMarks) {
				highestMarks = marks;
				student_with_highest_marks = name;
			}
		}

		// Display the student with the highest marks
		System.out.println("Student with the highest marks: " + student_with_highest_marks + " (" + highestMarks + ")");

		// Close the Scanner
		scanner.close();
	}
}
