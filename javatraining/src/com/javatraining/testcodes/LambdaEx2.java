package com.javatraining.testcodes;

interface aaa{
	int sum(int a,int b); 
}

public class LambdaEx2 {
public static void main(String[] args) {
	aaa c = (a,b)->(a+b);
	
	System.out.println(c.sum(30,60));
}
}