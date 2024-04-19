package com.javatraining.basic;

public class Studentsrecords {  
    /* declaration of instance variables. */  
    public String name; //public instance  
    String division;    //default instance  
    private int age;    //private instance  
    /* Constructor that initialize an instance variable. */  
    public Studentsrecords(String sname)  
    {  
        name = sname;  
    }  
  
    /* Method to initialize an instance variable. */  
    public void setDiv(String sdiv)  
    {  
        division = sdiv;  
    }  
      
    /* Method to initialize an instance variable. */  
    public void setAge(int sage)  
    {  
        age = sage;  
    }  
  
    /* Method to display the values of instance variables. */  
    public void printstud()  
    {  
        System.out.println("Student Name: " + name );  
        System.out.println("Student Division: " + division);   
        System.out.println("Student Age: " + age);  
    }  
  
    /* Driver Code */  
    public static void main(String args[])  
    {  
        Studentsrecords s = new Studentsrecords("Monica");  
        s.setAge(14);  
        s.setDiv("B");  
        s.printstud();  
    }  
}  