package com.careerera.remainingcollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

public class TestSets {

	public static String convertToUpperCase(String data) {
		return data.toUpperCase();
	}

	public static void main(String[] args) {

		List integers = new ArrayList();
		Stack<Integer> integersStack = new Stack<Integer>();

		for (int i = 0; i < 10; i++) {
	
			integers.add(i + 1);
		}

		
		for (int i = 0; i < 10; i++) {
			int data = (int) integers.get(i);
		}
		
		
		System.out.println("As Per LIFO LAst Entry" + integersStack.pop());

		System.out.println("As Per LIFO LAst Entry" + integersStack.pop());

		System.out.println("The Top Most Element" + integersStack.peek());
		System.out.println(integersStack);

		// List can store
		// sets allows only unique values
//		
//		List<String> listNonUniqueValues = new ArrayList<String>();
//		listNonUniqueValues.add("SomeData");
//		listNonUniqueValues.add("SomeData1");
//		listNonUniqueValues.add("SomeData2");
//		listNonUniqueValues.add("SomeData");
//		listNonUniqueValues.add("SomeData5");
//		listNonUniqueValues.add("SomeData");
//		listNonUniqueValues.add("SomeData9");
//
//		// ONly allows the unique values you can not add duplicate items into same
//		
//		Set<String> uniqueValues = new HashSet<>();
//		for (String string : listNonUniqueValues) {
//			uniqueValues.add(string);
//		}
//
//		uniqueValues.forEach(data -> {
//			System.out.println(convertToUpperCase(data));
//		});

		// Key with Employee Id and Value with complete Employee Object
//		Map<Integer, Employee> employeesMap = new HashMap<Integer, Employee>();
//
//		for (int i = 1; i <= 10; i++) {
//			Employee employee = new Employee("Dheeraj" + i, "Code Quality" + i);
//			employeesMap.put(employee.getId(), employee);
//		}

//		Set<Integer> keysFromMap = employeesMap.keySet();
//		Set<Entry<Integer, Employee>> integers = employeesMap.entrySet();
//
//		integers.forEach(setItem -> {
//			System.out.println(setItem.getKey() + " " + setItem.getValue());
//		});

//		employeesMap.forEach((key, val) -> {
//			System.out.println("key : " + key + "Employee" + val);
//		});

//		for (int i = 1; i <= 10; i++) {
//			Employee employee = new Employee("Dheeraj" + i, "Code Quality" + i);
//			employeesMap.put(employee.getId(), employee);
//		}
//
//		for (Integer employeeId : employeesMap.keySet()) {
//			System.out.println(employeesMap.get(employeeId));
//		}

//		for (Employee emp : employeesMap.values()) {
//			System.out.println(emp);
//		}
		// to fetch only unique items from this collections

	}
}
