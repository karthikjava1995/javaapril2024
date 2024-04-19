package com.javatraining.testcodes;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListEX {
	// ArrayList is the implements List interface
	// it using resizable array datastucture, it store value in index based a[0]
	// it maintain insertion Order
	// it accept null and duplicate values	
	// Array list is good for serching purpose	
		
//		current capacity*3/2+1
		public static void main(String[] args) {
			ArrayList<String> l = new ArrayList<>();
			
			l.add("Raavi");
			l.add("Sonu");
			l.add("lata");
	        l.add("Raavi");
			
			System.out.println(l);
			l.remove(3);
			System.out.println(l);
			
		}
		
	}

