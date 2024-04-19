package com.javatraining.basic;

public class ThisEx {
	// this keyword which is used to access the instance variable and instance method
	//calling constructo using this keyword
	
	// It can be used inside the method and constructor.
	// this() not a keyword which is used to invoke or call overloaded constructor of the same class
	
	String name;// global variable//john
	int age;// global variable//26

	public ThisEx(String name, int age) {// local variable
		this.name = name;// john
		this.age = age;// 26
	}

	void display() {
		System.out.println("name: " + name + " age : " + age);

	}

	public static void main(String[] args) {
		ThisEx n = new ThisEx("john", 26);
		n.display();

	}
}
