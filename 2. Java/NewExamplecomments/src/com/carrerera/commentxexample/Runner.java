package com.carrerera.commentxexample;

import java.util.Scanner;

public class Runner {

	// Employee Management System
	// Get a menu for a user to choose values from
	// 1. Add Employee
	// 2. Show All Employees

	public static void main(String[] args) {
		/// showMenu();
		// Scanner scaninput = new Scanner(System.in);

		int counter = 10;

		// we declaring a varible at some other location
		// incrementing it at some other location
		// checking the condition at some other location
		while (counter < 15) {
			System.out.println("I am runnig " + counter);
			counter++;
			// int a = counter +1;//10 + 45;
			// + binary operator that requires two operands
			// ++ unary operand that reqires only one operand
		}

		int val = 10;
		do {
			System.out.println("I am Hero");
			val++;
		} while (val < 10);

		// if the val is < 10 it means that i am hero

		// 1 2 4
		for (int ctr = 0; ctr < 10; ++ctr) {
			// 3
			System.out.println("in For Loop");
		}
	}

	private static void showMenu() {
		System.out.println("=============main menu===================");
		System.out.println("1. Add Employee");
		System.out.println("2. Show All Employees");
		System.out.println("enter from above choices");
	}
}
