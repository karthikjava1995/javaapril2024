package com.javatraining.basic;

public class Carrot extends Veg {
	public void halwa() {
		System.out.println("Need to cook halwa");

	}
	public static void main(String[] args) {
		Carrot a= new Carrot();
		a.chop();
		a.wash();
		a.halwa();
	}
}       
