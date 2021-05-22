package com.careerera.lms.beans;

import java.time.LocalDate;

public class Course {

	int id;
	String name;
	LocalDate startDate;
	LocalDate endDate;
	User instructor;
	static int tempId = 0;

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", instructor=" + instructor + ", learnes=" + learnes + "]";
	}

	public int getId() {
		return id;
	}

	public Course() {

		this.id = ++tempId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public User getInstructor() {
		return instructor;
	}

	public void setInstructor(User instructor) {
		this.instructor = instructor;
	}

	public java.util.List<User> getLearnes() {
		return learnes;
	}

	public void setLearnes(java.util.List<User> learnes) {
		this.learnes = learnes;
	}

	java.util.List<User> learnes;

}
