package com.careerera.lms.services;

import java.util.ArrayList;
import java.util.List;

import com.careerera.lms.beans.Course;
import com.careerera.lms.beans.Roles;
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

	// Make sure to fix this issues we are not able to
	/// add Instructor as well as learner to the courses
	// furure enhancements we can add File Input output here to

	@Override
	public Course assignLearnerToCourse(int userId, int courseId) {
		Course retCourse = null;
		// get the course first
		for (Course course : courses) {
			if (courseId == course.getId()) {
				for (User user : users) {
					if (user.getUserId() == userId && user.getRole() == Roles.LEARNER) {
						course.setLearnes(user);
						return course;
					}
				}
			}
		}
		return retCourse;
	}

	@Override
	public Course assignIntrucorToCourse(int userId, int courseId) {
		Course retCourse = null;
		for (Course course : courses) {
			if (courseId == course.getId()) {
				for (User user : users) {
					if (user.getUserId() == userId && user.getRole() == Roles.INSTRUCTOR) {
						course.setLearnes(user);
						return course;
					}
				}
			}
		}
		return retCourse;
	}

}
