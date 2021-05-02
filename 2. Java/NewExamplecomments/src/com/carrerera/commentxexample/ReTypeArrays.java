package com.carrerera.commentxexample;

import java.util.Scanner;

class Intern {
	String name;
	int id;
	String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Intern [name=" + name + ", id=" + id + ", type=" + type + "]";
	}
	
	
}

public class ReTypeArrays {

	public static void main(String[] args) {
		Intern[] interns = new Intern[3];

		for (int i = 0; i < interns.length; i++) {
			System.out.println("=== Working for interns [" + i + "]");
			interns[i] = new Intern();
			System.out.println("Please enter the id");
			interns[i].setId(new Scanner(System.in).nextInt());
			System.out.println("Please enter the name");
			interns[i].setName(new Scanner(System.in).nextLine());
			System.out.println("Please enter the Type");
			interns[i].setType(new Scanner(System.in).nextLine());
		}
		
		for (Intern intern : interns) {
			System.out.println(intern);
		}

	}

}
