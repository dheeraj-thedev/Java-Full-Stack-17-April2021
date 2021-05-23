package com.careerera.lms.runner;

import com.careerera.lms.uiservices.DashBoard;
import com.careerera.lms.utils.ReadUtil;

public class Runner {
	// your program will start

	ReadUtil readUtil;
	DashBoard board;

	public Runner() {

		readUtil = new ReadUtil();
		board = new DashBoard();

		checkUserOptions();
	}

	private void checkUserOptions() {
		int choice = 0;
		do {
			board.showInitialMessages();
			choice = readUtil.readInt("Please choose from above options", "Invalid Selection");
			switch (choice) {
			case 1: {
				board.addUser();
				board.showAllUsers();
				break;
			}
			case 5: {

				board.showAllUsers();
				break;
			}
			case 3: {
				board.addCourse();
				board.showAllCourse();
				break;
			}
			case 4: {
				board.showAllCourse();
				break;
			}
			case 6: {
				// parm show all unassigned may be
				// select user
				board.showAllCourse();
				int courseId = readUtil.readInt("Please choose a course from above courses",
						"Invalid Input or course Id");
				board.showAllInstructor();
				int userId = readUtil.readInt("Please choose a Instructor from above users",
						"Invalid Input or course Id");
				// 1.java
				// 2 Dot net
				board.addInstructorToCourse(courseId, userId);
				break;
			}
			case 7: {
				board.showAllCourse();
				int courseId = readUtil.readInt("Please choose a course from above courses",
						"Invalid Input or course Id");
				board.showAllLearner();
				int userId = readUtil.readInt("Please choose a Learner from above users", "Invalid Input or course Id");
				// 1.java
				// 2 Dot net
				board.addInstructorToCourse(courseId, userId);
				break;
			}
			default:
				System.out.println("ivalid choise " + choice);
			}
		} while (choice != 8);
	}

	public static void main(String[] args) {
		new Runner();
	}
}
