package com.javatraining.basic;

public class Chilly extends Veg{
	public void bajji() {
		System.out.println("prepare bajji");

	}
	public static void main(String[] args) {
		Chilly a= new Chilly();
		a.chop();
		a.wash();
		a.bajji();
}
}
