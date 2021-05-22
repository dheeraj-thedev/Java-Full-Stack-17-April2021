package com.careerera.lms.uiservices;

import java.util.List;

import com.careerera.lms.beans.Course;
import com.careerera.lms.beans.Roles;
import com.careerera.lms.beans.User;
import com.careerera.lms.services.CourseService;
import com.careerera.lms.services.ICourseServices;
import com.careerera.lms.utils.ReadUtil;

public class DashBoard {

	// we will get methoods related to userInterface

	ReadUtil readUtil;
	ICourseServices courseServices;

	public DashBoard() {
		readUtil = new ReadUtil();
		courseServices = new CourseService();
	}

	public void showInitialMessages() {
		System.out.println("Main Menu========================");
		System.out.println("1. To add a Learner");
		System.out.println("2. To add an Instructor");
		System.out.println("3. To add a Course");
		System.out.println("4. To show all courses");
		System.out.println("5. To show all Users");

	}

	public void addCourse() {
		Course course = new Course();
		course.setName(readUtil.readString("Please enter the Name of the course", "Invalid Name"));
		course.setStartDate(readUtil.readDate("Please enter the Start {YYYY-MM-DD} date ", "Invalid Date"));
		course.setEndDate(readUtil.readDate("Please enter the End {YYYY-MM-DD} date ", "Invalid Date"));
		courseServices.saveCourse(course);

	}

	public void addUser() {
		User user = new User();
		user.setName(readUtil.readString("Please enter the name ", "Invalid Name"));
		user.setEmail(readUtil.readString("Please enter the email", "Invalid  Email"));
		user.setAddress(readUtil.readString("Please enter the address", "invalid Address"));
		int role = readUtil.readInt("Please choose 	\n 1. ->ADMIN \n2 ->INSTRUCTOR \n3. -> LEARNER\r\n",
				"Invalid Role Selection");
		switch (role) {
		case 1: {
			user.setRole(Roles.ADMIN);
			break;
		}
		case 2: {
			user.setRole(Roles.INSTRUCTOR);
			break;
		}
		case 3: {
			user.setRole(Roles.LEARNER);
			break;
		}

		default:
			System.out.println("Unexpected value: " + role);
		}

		courseServices.saveUser(user);
	}

	public void showAllCourse() {
		courseServices.getAllCourses().forEach(System.out::println);
	}

	public void showAllUsers() {
		List<User> list = courseServices.getAllUsers();
		System.out.println(list);
		System.out.println(list.size());

	}

}
