package com.careerera.lms.services;

import java.util.List;

import com.careerera.lms.beans.Course;
import com.careerera.lms.beans.User;

public interface ICourseServices {

	List<Course> getAllCourses();

	boolean saveCourse(Course course);
	
	List<User> getAllUsers();

	boolean saveUser(User user);
	
	
	
}
