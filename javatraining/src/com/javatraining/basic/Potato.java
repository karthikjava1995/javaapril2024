package com.javatraining.basic;
public class Potato extends Veg {
	public void chips()
	{
		System.out.println("prepare chips");

	}
	public static void main(String[] args) {
		Potato a = new Potato();
		a.chop();
		a.wash();
		a.chips();
	}
}
