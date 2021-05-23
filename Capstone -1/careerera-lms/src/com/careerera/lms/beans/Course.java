package com.careerera.lms.beans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Course {

	int id;
	String name;
	LocalDate startDate;
	LocalDate endDate;
	List<User> instructors;
	List<User> learners;

	static int tempId = 0;

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", instructors =" + (instructors.size() > 0 ? instructors : "Add an instructor") + ", learnes="
				+ (learners.size() > 0 ? learners.size() : "No") + " learnes ] \n";
	}

	public int getId() {
		return id;
	}

	public Course() {

		this.id = ++tempId;
		instructors = new ArrayList<User>();
		learners = new ArrayList<User>();
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

	public List<User> getInstructor() {
		return instructors;
	}

	public void setInstructor(User instructor) {
		this.instructors.add(instructor);
	}

	public java.util.List<User> getLearnes() {
		return learnes;
	}

	public void setLearnes(User learner) {
		this.learnes.add(learner);
	}

	java.util.List<User> learnes;

}
