package com.carrerera.commentxexample;

public class ArraysExample {

	char[] character;

	public void createArray() {
		character = "I am a coder".toCharArray();
	}

	public void printArray() {
		for (char c : character) {
			System.out.print(c + "|");
		}
	}

	public static void main(String[] args) {

		ArraysExample arraysExample= new ArraysExample();
		arraysExample.createArray();
		arraysExample.printArray();

		// create an array that will store below type of values in array

		// [0] =1000
		// [1]="My Name"
		// [2] =123.4f
		// array is homogenious king collection
//
//		Object object[] = new Object[10];
//
//		object[0] = 100;
//		object[1] = "Some Name";
//		object[2] = 1234.43;
//
//		int mark = 99;
//		int[] marks = { 1, 2, 3 }; // Style 1
//		int[] marks2 = new int[10]; // Style 2
//
//		for (int i = 0; i < marks2.length; i++) {
//			marks2[i] = (int) (Math.random() * 100);
//		}
//
//		for (int data : marks2) {
//			System.out.println(data);
//		}

		// multiply each elemet with 2

	}
}
