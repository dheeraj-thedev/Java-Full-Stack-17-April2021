package com.carrerera.commentxexample;

public class MyDate {
	int day;     // heap
	int month;
	int year;

	public MyDate(MyDate date) {
		this.day = date.day;
		this.month = date.month;
		this.year = date.year;
	}


	public MyDate addDays(int moreDays) {
		this.day =this.day+moreDays;
		return this;
		
	//	MyDate newDate = new MyDate(this);   // 
	//	newDate.day = newDate.day + moreDays;
		//return newDate;
	}

	public MyDate(int day, int month, int year) {

		this.day = day;
		this.month = month;
		this.year = year;
	}
  // stack   =>> push , pop , peek
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

}
