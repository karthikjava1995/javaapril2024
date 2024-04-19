package com.javatraining.condition;

import java.util.Scanner;

public class Reportcard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your percentage : ");
		double score = sc.nextDouble();
		if (score >= 90 && score <= 100) {
			// &&-> and, != -> Not equal to,|| -> or, == -> Equalto

			System.out.println("First division with dis");
		} else if (score >= 60 && score < 90) {
			System.out.println("First division");
		} else if (score >= 50 && score < 60) {
			System.out.println("Second division");
		} else if (score >= 33 && score < 50) {
			System.out.println("Third division");
		} else if (score >= 0 && score < 33) {
		}

	}
}
