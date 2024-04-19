package com.javatraining.basic;

// we have 2 types of datatype - primitive & non primitive
public class java_basic 
{
	void add(int a, int b)
	{
		System.out.println("addition operation");
		System.out.println("addition of two numbers=:" + (a + b + 1));

	}

	void mul(int a, int b, int c) 
	{

		System.out.println("addition of two numbers=:" + (a * b * c));
	}

	public static void main(String[] args) 
	{
		java_basic s = new java_basic();
		s.add(2, 4);
		s.mul(22, 4, 5);

	}

//	int = number = short 
//	byte 
//	boolean = true and false
//	float double = 6.0 , 7.1

	// Non - primitive datatype
	// String Arrays //Wrapperclass

//variable = datatype varibale = value	
	// int a = 10;
	// String s = "hello world";

//identifier rules: 
	// 1. Class name always start with Capital letter
	// 2. we can not use space with identifier.
	// 3. we can't use special character with identifier apart from _
	// 4. Identifier must not be a java keyword
	// 5. identifier have number but we can't start with number
//uzu-zcyn-ezopackage com.javatraining.basic;

}
