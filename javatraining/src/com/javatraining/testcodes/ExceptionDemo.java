package com.javatraining.testcodes;

public class ExceptionDemo {
	public static void main(String[] args) {

		int a = 10,b =2;
		int c=1;
		try {
			c = a / b; //throw
			
//			System.out.println("code executed good");
			
		} catch (Exception e)
		{
			System.err.println("error occured");
//			System.errprintln
		}
		System.out.println(c);
		System.out.println("end of program");

	}

}
