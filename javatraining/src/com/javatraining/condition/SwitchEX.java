package com.javatraining.condition;

import java.util.Scanner;

public class SwitchEX {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the week day");
		String s = sc.next();
		switch (s)
		{
		case "Sunday":
			System.out.println("Today is Sunday");
			break;
		case "Monday":
			System.out.println("Today is monday");
			break;
		case "Tuesday":
			System.out.println("Today is Tuesday");
			break;
		case "Wednesday":
			System.out.println("Today is Wednesday");
			break;
         case "Thurday":
			System.out.println("Today is thurday");
			break;
		case "Friday":
			System.out.println("Today is Friday");
			break;
		case "Saturday":
			System.out.println("Today is Saturday");
			break;
		default:
			System.out.println("This is not a week day");
		}
	} 
}