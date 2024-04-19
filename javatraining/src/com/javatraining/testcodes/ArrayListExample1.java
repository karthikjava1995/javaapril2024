package com.javatraining.testcodes;

import java.util.ArrayList;

public class ArrayListExample1 {
	
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Mango");// Adding object in arraylist
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		// Printing the arraylist object
		System.out.println(list);
		
		list.remove(2);
		list.set(2, "papaya");
		System.out.println(list);
		
	}
}