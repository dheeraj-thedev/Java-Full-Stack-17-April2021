package com.careerera.lms.services;

import java.util.ArrayList;
import java.util.List;

import com.careerera.lms.beans.Course;
import com.careerera.lms.beans.User;

public class CourseService implements ICourseServices {

	List<Course> courses = new ArrayList<Course>();
	List<User> users = new ArrayList<User>();

	@Override
	public List<Course> getAllCourses() {
		return courses;
	}

	@Override
	public boolean saveCourse(Course course) {
		return courses.add(course);
	}

	@Override
	public List<User> getAllUsers() {
		return users;
	}

	@Override
	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		return users.add(user);
	}

}
