package com.carrerera.commentxexample;

public class StackExample {
	
	public static void m1() {   // push
		int a=10;
		System.out.println("In M1");
		m2();
	} // pop
	public static void m2() {
		System.out.println("In M2");
	} // pop
	
	
	public static void main(String[] args) {   // push
		m1();
	} //  pop
}
