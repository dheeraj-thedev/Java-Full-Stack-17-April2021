package com.careerera.lms.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;


public class ReadUtil {
	// how to read input from the user ?
	// Scanner approach -->
	// BufferedReader

	private BufferedReader reader;

	public ReadUtil() {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	public String readString(String userMsg, String errorMsg) {
		String str = "";
		try {
			System.out.println(userMsg);
			str = reader.readLine();
			if (str.trim().length() == 0) {
				System.err.println(errorMsg);
				str = readString(userMsg, errorMsg);
				;
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return str;
	}

	public int readInt(String userMsg, String errorMsg) {
		int val = 0;
		try {
			System.out.println(userMsg);
			val = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			System.err.println(e.getMessage() + "\n" + e.getLocalizedMessage());
			val = readInt(userMsg, errorMsg);
		} catch (IOException e) {
			System.err.println(e);
		}
		return val;
	}

	public LocalDate readDate(String userMsg, String errorMsg) {
		LocalDate val = null;
		try {
			System.out.println(userMsg);
			val = LocalDate.parse(reader.readLine());

		} catch (DateTimeParseException e) {
			System.err.println(e.getMessage() + "\n" + e.getLocalizedMessage());
			val = readDate(userMsg, errorMsg);
		} catch (IOException e) {
			System.err.println(e);
		}
		return val;
	}

}
