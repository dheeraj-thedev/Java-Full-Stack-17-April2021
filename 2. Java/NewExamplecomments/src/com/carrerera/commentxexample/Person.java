package com.carrerera.commentxexample;

public class Person {
	public static void main(String[] args) {
		MyDate date; // this is reference 
		int val;    // this is primitive
		val = 11;
		changeInt(val);
		System.out.println("Int value is: " + val);  // 11 or 111
		date = new MyDate(12, 7, 1964); // Date of 
		changeObjectRef(date);
		System.out.println("MyDate: " + date.toString());
		changeObjectAttr(date);
		System.out.println("MyDate: " + date);
		
		date.addDays(10);
		
		
	}

	public static void changeObjectRef(MyDate ref) {
		ref = new MyDate(1, 1, 2000);
	}

	public static void changeObjectAttr(MyDate ref) {
		ref.setDay(4);
	}

	private static void changeInt(int val) {
		val += 100;

	}
}
