package com.javatraining.basic;

public class ReturnType  
{  
    /* Method with an integer return type and no arguments */  
    public int CompareNum()   
    {   
        int x = 13;  
        int y = 28;  
        System.out.println("x = " + x + "\n  y = " + y);  
        if(x>y)  
            return x;  
        else  
            return y;  
    }  
      
    /* Driver Code */  
    public static void main(String arg[])   
    {  
    	ReturnType obj = new ReturnType();  
        int result = obj.CompareNum();  
        System.out.println("The greater number among x and y is: " + result);  
    }  
}  