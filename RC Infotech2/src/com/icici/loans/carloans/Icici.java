package com.icici.loans.carloans;

public class Icici implements Rbi
{
    
	@Override
	public void withdrawl() 
    {
    	
	    System.out.println("i am overrideen withdrawl in ICICI");	
		
	}

	@Override
	public void deposit() {
		System.out.println("i am overridden deposit in ICICI");
		
	}

}
