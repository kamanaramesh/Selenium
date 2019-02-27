package com.icici.loans.carloans;

import java.util.Scanner;

public class ArthimathicException
 {
	public static void main(String[] args) 
	
	{
	
		int nr, dr, result;
		Scanner sc=new Scanner(System.in);
					
		
		while (true)
		{
			System.out.println("Enter Numarator value :");
			nr=sc.nextInt();
			
			System.out.println("Enter the Denominator value :");
			dr=sc.nextInt();
		
		try 
		{
			result = nr / dr;
			System.out.println(result);
			break;
			
		}
		catch (ArithmeticException e)
		{
			
			//e.printStackTrace();
			//System.out.println(e);
			System.out.println("Denominator value should be greather than Zero...");
		}
		}
	}
 }

		
	

		
		
		
		
		
		
		

	


