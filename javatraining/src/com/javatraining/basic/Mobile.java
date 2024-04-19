package com.javatraining.basic;

public class Mobile 
{
	String mobilename = "samsung"; // variable
	String mobilemodel = "note9";

	void appinstalled()
	{ 
		// Method
		System.out.println("App is installed");
		System.out.println("Mobile name" + mobilename);
	}

	void settings() 
	{
		System.out.println("settings Enabled");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Function");
		// Mobile m1; //reference variable
		// new mobile(); //calling constructor
		Mobile m1 = new Mobile();
		m1.appinstalled();
		m1.settings();
	}
}
//inside the methods all variables is called encapsulation