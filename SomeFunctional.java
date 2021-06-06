package com.careerera.functionalProrgramming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

//List interface and along with its on of the implementation ArrayList

//Functional Pragramming  what only | how 
//1. Functional Programming basics 
//          Functions as fist class citizens 
//          pure functions
//          higer order function 
//We will get back to our other collention

//ArrayList || Arrays 

//class ObjectOfNonPure {
//	int i = 0;
//
//	public int add(int someValue) {
//		this.i = someValue;// side effect
//		return this.i;
//	}
//}
//
//// pure function
//class ObjectOfPureFunction {
//	public int sum(int a, int b) {
//		return a + b;
//	}
//}

//now into this functions can also be passed to another function

//objects our firstclass citizens

//they have some set of rules 
//1. No state 
//2. No side effects
//3. immutable variables
//

// 2 HOF higer order functions 
// A the function would take one or more function as an argument
// the stated function must return some function

// Implementation Style  1
//class Person implements Comparator<Person>{
//
//	@Override
//	public int compare(Person o1, Person o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	
//}

//interface FirstFunctionaExample {
//	void doSomething();
//}

// UnaryOperator UnaryObject

// BinaryOperator

// Supplier

// Consumer : it will only consume your data and may it can print that but return anything 
class checkInvalidAge implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return t <= 18;
	}
}

class CheckForNull implements Predicate {

	@Override
	public boolean test(Object t) {
		// TODO Auto-generated method stub
		return t == null;
	}
}

class AddSome implements Function<Long, Long> {
	@Override
	public Long apply(Long t) {
		return t + 10;
	}

}

class Person {

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	String name;
	int age;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{Name " + name + "\nAge " + age + "}";
	}
}

public class SomeFunctional {
	public static void main(String[] args) {

		// OperatorOverlo

		BinaryOperator<String> binaryOperator = (value, value2) -> {
			return value + "-" + value2;
		};

		System.out.println("The binary result is :" + binaryOperator.apply("Dheeraj", "Singh"));

		UnaryOperator<Person> unaryOperatorExample = (person) -> {
			person.name = person.name.toUpperCase();

			return person;
		};
		Person p = new Person("Dheeraj Singh", 33);
		p = unaryOperatorExample.apply(p);
		System.out.println(p);

//		// Scenario 1 We have to use utility only once
//
//		// Scenario 2 we have save the refrence for further usage
//
//		Predicate<Integer> lessThan18 = (Integer t) -> {
//			// TODO Auto-generated method stub
//			return false;
//		};
//
//		/// if the length is less than 4
//		Predicate<String> stringLengthLessthan4 = (value) -> {
//			return value.length() < 4;
//		};
//
//		Predicate checkForNull = new CheckForNull();
//
//		System.out.println("Test for Dheeraj " + stringLengthLessthan4.test("Dheeraj"));
//		System.out.println("Test for Dhe" + stringLengthLessthan4.test("Dhe"));
//		Scanner scanner = new Scanner(System.in);
//		Scanner scanner2 = null;
//		System.out.println("Test for Null Scanner2" + checkForNull.test(scanner2));
//		System.out.println("Test for Null Scanner" + checkForNull.test(scanner));
//
//		System.out.println("Please enter the age ");
//		System.out.println("Test for Invalid Age " + new checkInvalidAge().test(new Scanner(System.in).nextInt()));

//		Function<Long, Long> adding1 = (value) -> {
//			return value + 10;
//		};
//
//		Function<Long, Long> adding = new AddSome();
//
//		System.out.println("Lambda Example" + adding1.apply((long) 5));
//		System.out.println("The Implementaion" + adding.apply((long) 10));

		// FirstFunctionaExample example = () -> {
//			System.out.println("Implemented");
//		};
//		example.doSomething();

//		List<String> names = new ArrayList<String>();
//		names.add("Ramesh");
//		names.add("Ammy");
//		names.add("Jhon");
//
//		// Style 2 anynomous inner block or class // extra verbosity
////		Comparator<String> comparator = new Comparator<String>() {
////
////			@Override
////			public int compare(String a, String b) {
////				return a.compareTo(b);
////			}
////		};
//
//		Comparator<String> comparator = (String a, String b) -> {
//			return a.compareTo(b);
//		};
//
//		Comparator<String> comparatorReversed = comparator.reversed();
//
//		Collections.sort(names, comparatorReversed);
//		//

		// names.forEach(System.out::println);

	}

}
