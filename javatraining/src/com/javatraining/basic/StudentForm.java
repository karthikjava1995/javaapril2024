package com.javatraining.basic;

import java.util.Scanner;

public class StudentForm {

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		System.out.println("Enter the stduent id:");
		int  std_id = std.nextInt();
		System.out.println("Enter the student name:");
		String std_name = std.next();
		System.out.println("Enter the student address:");
		String std_address= std.next();
		System.out.println("Enter the student mail id:");
		String std_mailid = std.next();
		System.out.println("std_id : " +  std_id);
		System.out.println("std_name : " + std_name);
		System.out.println("std_address : " + std_address);
		System.out.println("std_mailid: " + std_mailid);
	}
}
