package com.icici.loans.carloans;

import java.util.Scanner;

public class UserException extends Exception
{

	
	public UserException(String string) 
	{
		super(string);
	}

	public static void main(String[] args)
	{
   
		Scanner sc=new Scanner(System.in);
		
			
		while (true)
		{
			System.out.println("Enter the althaNumeric value :");
			String Val = sc.nextLine();
			
			try {
				if (Val.length()!=10)
				{
					try
				{
						throw new UserException("Value should be 10 digit alpha Numaric");
					}
				    catch (UserException e) 
					{
						
						e.printStackTrace();
					}
					
					
       }
				else
				{
				System.out.println(Val);
				break;
				
    }
			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				System.out.println(" i  am final block...");
			}
   }
			
}
}
	

	
