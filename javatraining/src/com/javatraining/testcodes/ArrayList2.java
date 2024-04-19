package com.javatraining.testcodes;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		
		l.add("Raavi");
		l.add("Sonu");
		l.add("lata");
        l.add("Raavi");
		
		System.out.println(l);
		l.remove(3);
		l.set(2, "john");
//		l.set(3, "jokk");
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.contains("raavi"));
	
	}
	
}

