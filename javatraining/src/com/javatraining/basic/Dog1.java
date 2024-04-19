package com.javatraining.basic;

public class Dog1 extends Animal1 { // Subclass (child)
	public void animalSound() {
		super.animalSound(); // Call the superclass method
		System.out.println("The dog says: bow wow");
	}

//			/* public class Main { */
	public static void main(String args[]) {
		Animal1 a = new Dog1(); // Create a Dog object
		a.animalSound(); // Call the method on the Dog object
	}
}
