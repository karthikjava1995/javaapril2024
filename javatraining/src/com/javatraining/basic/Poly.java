package com.javatraining.basic;

public class Poly {
	// compile time polymorphism with method overloading
	// multiple methods with same name , same access specifier same in return type
	// but different in Sign(Arguments) that is called method overloading.
	public void run(double a) {// concrete method
		System.out.println(a);
	}

	public void run(int a, int b) {
		System.out.println(a + b);
	}

	public void run(String a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		Poly p = new Poly();// Object reference of a class
		p.run("Hello");
		p.run(2, 30);
		p.run(7.5);
	}

}