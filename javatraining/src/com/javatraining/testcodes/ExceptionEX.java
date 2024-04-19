package com.javatraining.testcodes;

public class ExceptionEX 
{
	public static void main(String[] args)
	{
		int[] a = new int[5]; // 4
		try
		{
			a[32] = 30 / 1; // risky block
		} 
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic issue");
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndex issue");
		}
		catch (Exception e)
		{
			System.out.println("Exception");
		}
		finally
		{
			System.out.println("Hello, finally");
		}
	}
}
		
