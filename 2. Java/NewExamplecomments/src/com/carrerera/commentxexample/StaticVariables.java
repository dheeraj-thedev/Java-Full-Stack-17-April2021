//package com.carrerera.commentxexample;
//
//class TestStatic {
//
//	public int marks;
//	static int someNumber = 10;
//}
//
//// The id in the employee class should be incremented as soon somene creates any
//// instance of this class
//class Employee {
//	private static int tempId = 0;
//	int id;
//	String name;
//	String project;
//
//	public Employee(String name, String project) {
//		this.name = name;
//		this.project = project;
//		this.id = ++tempId;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", project=" + project + "]";
//	}
//
//}
//
//public class StaticVariables {
//
//	public static void main(String[] args) {
//		int i = 0;
//
//		int z = 10;
//		int a = 2;
//		int s = z & a;
//
//		if (i != 0 && i == 0) {
//
//		}
//
//		System.out.println(i);
//		Employee Raman = new Employee("Raman", "Apiro");
//		Employee Rajesh = new Employee("Rajesh", "Ford");
//		Employee Don = new Employee("Don", "BlockBash");
//
//		System.out.println(Raman);
//		System.out.println(Rajesh);
//		System.out.println(Don);
////		TestStatic state1 = new TestStatic();
////		state1.marks = 10;
////
////		System.out.println("The Instance Variable" + state1.marks);
////		System.out.println("The static in state 1 Variable" + TestStatic.someNumber);
////		System.out.println("The static in state 2 Variable" + state1.someNumber);
////
////		TestStatic state2 = new TestStatic();
////		state2.marks = 20;
////		System.out.println("The Instance Variable" + state2.marks);
////		System.out.println("The static in state 2 Variable" + TestStatic.someNumber);
////		System.out.println("The static in state 2 Variable" + state2.someNumber);
////
////		TestStatic state3 = new TestStatic();
////		state3.marks = 30;
////		state3.someNumber = 100;
////		System.out.println("The Instance Variable" + state3.marks);
////		System.out.println("The Static in state 3 Variable" + TestStatic.someNumber);
////		System.out.println("The static in state 2 Variable" + state1.someNumber);
//	}
//}
