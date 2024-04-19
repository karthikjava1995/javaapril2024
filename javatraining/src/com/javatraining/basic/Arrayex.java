package com.javatraining.basic;

public class Arrayex { //immutable
	/*
	 * int a1 = 1; int b = 2; int c = 3;
	 * 
	 * int[] a = new int[5];// a[0]=1; a[1]=6; a[2]=8; a[3]=9; a[4]=6; a[5]=8;
	 * a[7]=10;
	 */
    
    public static void main(String[] args) {
		String s1 = "hello";//Stringpool
		String s2 = "hello";
		String s3 = new String("hello");//heap
		
		System.out.println(s1==s2);//true//reference
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3)); 
    }
}
//true //value
  //	System.out.println(s);
		
		
	//	Primitive datatype having corresponding wrapper class
		//final keyword, it can't be inherit
		
		//int  -    Integer
		//boolean - Boolean
		//byte -    Byte
		//short -   Short
		//char -    Character
		//float -   Float
		
		
		//Autoboxing:- coversion of primitive to wrapper class called Autoboxing
		//Auto unboxing :- Coversion of wrapper to primitive caller auto unboxing