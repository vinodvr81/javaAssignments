package com.assignments.five;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeHashMap {

	public static void main(String[] args) {
		Map<Integer, String> employee_records = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 5 employee records:");
		for (int i = 1001; i <= 1005; i++) {
			System.out.print("Enter employee name for record " + i + ": ");
			String name = scanner.nextLine();
			employee_records.put(i, name);
		}

		// Display the employee records that were stored in a hashmap
		System.out.println("Employee records:");
		for (Map.Entry<Integer, String> entry : employee_records.entrySet()) {
			int recordNumber = entry.getKey();
			String name = entry.getValue();
			System.out.println("Record " + recordNumber + ": " + name);
		}
		scanner.close();
	}
}
