package com.javatraining.condition;

public class StringimmutableEx {
	public static void main(String[] args) {
		//String literal
		String a1 = "Raj";
		String b1 = "Raj";
		
		a1.concat("Kumar");
		System.out.println(a1);
		//Strings in Java are immutable, which means that once they are created, 
		//their values cannot be changed.
		
		//String with new
		String a = new String("Ankit");
		System.out.println(a);
		String b = new String("Ankit");
		System.out.println(b);

		a.concat("singh");
		System.out.println(a);
	}



}

