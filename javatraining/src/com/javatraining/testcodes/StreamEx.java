package com.javatraining.testcodes;
import java.util.Arrays;
import java.util.List;

//Stream API:

//definition:
//Stream api in java provides powerful and expressive way to process collection of the data in a functional and  declarative manner .
//it allows to perform various operations on the elements of collections such as mapping,filtering,reducing,and more.

public class StreamEx {
	public static void main(String[] args) {

		//
		
		
		List<Integer> c = Arrays.asList(1,6,8,3,5,2,9); 
		
		int a = c.stream().filter(n->n%2==0).mapToInt(n->n).sum();
		
		System.out.println(a);
	}
	}


