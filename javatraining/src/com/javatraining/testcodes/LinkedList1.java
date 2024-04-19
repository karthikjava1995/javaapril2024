package com.javatraining.testcodes;

import java.util.LinkedList;

public class LinkedList1 {

	// linkedList is the implements List interface
	// it using Doubly linked list as datastructure, it store value in nodes format
	// it maintain insertion Order
	// it accept null and duplicate values	
	// Linked list is good for modification purpose.
	public static void main(String[] args) {
		LinkedList <String> l = new LinkedList<String>();
		l.add("Raavi");
		l.add("Sonu");
		l.add("lata");
        l.add("Raavi");
		
		System.out.println(l);
		l.remove(3);
		System.out.println(l);
		l.set(1,"karthik");
		System.out.println(l);
		l.addFirst("riz");
		System.out.println(l);
//		for(String i:l)
//			System.out.println(l);
	}
}

