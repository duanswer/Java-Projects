package studentdatabseapp;

import java.util.Scanner;

public class student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor: prompt user to enter student's name and year
	public student() {
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1- Freshmen\n2- Sophmore\n3- Junior\n4- Senior\n Enter student class lvel: ");
		this.gradeYear = in.nextInt();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear);		
		setStudentID();		
	}
	
	// Generate ID
	private void setStudentID() {
		// Grade level + ID
		id++;
		this.studentID =  gradeYear + "" + id;
	}
	
	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (0 to quit): ");
			Scanner in  = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				break;
			}
		}while(1 != 0);		
	}
	
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	 
	// Pay Tuition
	public void payTuition() {
		viewBalance();
		Scanner in  = new Scanner(System.in);
		System.out.print("Enter your payment: ");
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();		
	}
	
	// Show Status
	public String toString() {
		return "Name: " + firstName + " " + lastName + 
				"\nGrade Level: " + gradeYear + 
				"\nStudent ID" + studentID + 
				"\nCourses Enrolled: " + courses + 
				"\nTuition Balance: $" + tuitionBalance;
	}
	

}
