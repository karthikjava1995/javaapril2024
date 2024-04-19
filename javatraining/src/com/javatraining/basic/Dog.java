package com.javatraining.basic;

public class Dog extends Animal {
	String color = "white";

	public Dog() {
//super keyword:
//->variable,Methods,Constructor we can implement the code
		super("cat");
//		super();

		System.out.println("pug");
	}

	void display() {
		System.out.println(color);
		System.out.println(super.color);
	}

	public static void main(String[] args) {

		Dog d = new Dog();
		d.display();
	}
}
