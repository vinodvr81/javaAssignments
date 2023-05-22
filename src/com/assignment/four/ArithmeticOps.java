package com.assignment.four;

public class ArithmeticOps {

	public static int subtract(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static double divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Cannot divide by zero");
		}
		return (double) a / b;
	}

	public static int factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Factorial is not defined for negative numbers");
		}
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static int reverseDigits(int number) {
		int reversed = 0;
		while (number != 0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number /= 10;
		}
		return reversed;
	}
}
