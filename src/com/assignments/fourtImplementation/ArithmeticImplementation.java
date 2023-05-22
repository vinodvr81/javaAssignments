package com.assignments.fourtImplementation;
import com.assignment.four.ArithmeticOps;

public class ArithmeticImplementation {


    public static void main(String[] args) {
        int a = 100;
        int b = 5;

        int subtract_result = ArithmeticOps.subtract(a, b);
        System.out.println("Subtraction: =" + subtract_result);

        int multiply_result = ArithmeticOps.multiply(a, b);
        System.out.println("Multiplication: =" + multiply_result);

        double divide_result = ArithmeticOps.divide(a, b);
        System.out.println("Division: =" + divide_result);

        int factorial_result = ArithmeticOps.factorial(a);
        System.out.println("Factorial: =" + factorial_result);

        int number = 43243;
        int reverse_result = ArithmeticOps.reverseDigits(number);
        System.out.println("Reverse of digits of a number " + number + " is: " + reverse_result);
    }
}
