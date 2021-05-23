package com.careerera.lms.services;

import java.util.List;

import com.careerera.lms.beans.Course;
import com.careerera.lms.beans.User;

public interface ICourseServices {

	List<Course> getAllCourses();

	boolean saveCourse(Course course);

	List<User> getAllUsers();

	boolean saveUser(User user);

	// this will find course and user will associate
	// if user has student type of role
	Course assignLearnerToCourse(int userId, int courseId);

	Course assignIntrucorToCourse(int userId, int courseId);

}
