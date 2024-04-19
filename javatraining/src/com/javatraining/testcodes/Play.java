package com.javatraining.testcodes;


class UserDefineEx extends Exception 
{
	   
	public UserDefineEx(String s){
		super(s);
	}
}

 public class Play{
	 public static void main(String[] args) throws UserDefineEx {
		 try { 
			 
		 throw new UserDefineEx("This is my userdefine Exception");
		 }catch(UserDefineEx e) {
			 System.out.println("This is my userdefine Exception");
		 }
	}
 }