package com.icici.loans.carloans;

public class ChildClass1 extends FirstAbstract
{
	public static void main(String[] args)
	{
	
 ChildClass1 c=new ChildClass1();
 c.m1();
 c.m2();
 
	
	}
	
	
	
     
	@Override
	public void m2() 
	{
		System.out.println("iam overridden m2 in childclass");
		
	}
	

}
