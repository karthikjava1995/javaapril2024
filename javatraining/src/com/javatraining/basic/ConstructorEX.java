package com.javatraining.basic;

public class ConstructorEX {

//Constructor : To create object reference of a class with new keyword.
//Constructor have same as Class name and it is special type of method. it is not having any return type.	
//	ConstructorEX c = new ConstructorEX();
//Default Constructor || user define Constructor	
	public ConstructorEX() {
		System.out.println("This is default constructor");
	}

	public ConstructorEX(int a) {// User Define0
		System.out.println("This is user constructor");
	}
 
	public ConstructorEX(int a, int b) {// User Define
		System.out.println("This is double user constructor");
	}
   public ConstructorEX(int a, int b, int c){// User Define
    System.out.println("This is 3 user constructor");
	}

	public static void main(String[] args) {
		ConstructorEX c = new ConstructorEX();
		ConstructorEX c1 = new ConstructorEX(3);
		ConstructorEX c2 = new ConstructorEX(3,9,1);
		ConstructorEX c3 = new ConstructorEX(3, 9 );
		// Syntax: Classname variable = keyword Constructor();
	}
}