package com.assignments.five;

public class WrapperClssForInteger {

	public static void main(String[] args) {
		// Integer Type Wrapper Class
		Integer integer_from_wrapper = new Integer(432);
		int integer_primitive = integer_from_wrapper.intValue();
		System.out.println("Integer Wrapper Class:");
		System.out.println("Value: " + integer_from_wrapper);
		System.out.println("Unboxed value: " + integer_primitive);

		// Boolean Type Wrapper Class
		Boolean myBool = new Boolean(false);
		boolean boolPrimitive = myBool.booleanValue();
		System.out.println("\nBoolean Wrapper Class:");
		System.out.println("Value: " + myBool);
		System.out.println("Unboxed value: " + boolPrimitive);

		// Character Type Wrapper Class
		Character myChar = new Character('Z');
		char charPrimitive = myChar.charValue();
		System.out.println("\nCharacter Wrapper Class:");
		System.out.println("Value: " + myChar);
		System.out.println("Unboxed value: " + charPrimitive);

		// Double Type Wrapper Class
		Double myDouble = new Double(13.145);
		double doublePrimitive = myDouble.doubleValue();
		System.out.println("\nDouble Wrapper Class:");
		System.out.println("Value: " + myDouble);
		System.out.println("Unboxed value: " + doublePrimitive);

		// Long Type Wrapper Class
		Long myLong = new Long(56456245L);
		long longPrimitive = myLong.longValue();
		System.out.println("\nLong Wrapper Class:");
		System.out.println("Value: " + myLong);
		System.out.println("Unboxed value: " + longPrimitive);
	}
}
