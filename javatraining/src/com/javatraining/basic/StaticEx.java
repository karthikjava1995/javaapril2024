package com.javatraining.basic;

public class StaticEx {
	static int a;
	int b;
	
	public static void mobile() {
		System.out.println("i phone");
	}

	public void tab() {
		System.out.println("smasung tab");
		
	}
	public static void main(String[] args) {
		a=20;
		mobile();
		StaticEx n=new StaticEx();//create object for access static key word
		n.tab();
		n.b=30;
		
	}
}
