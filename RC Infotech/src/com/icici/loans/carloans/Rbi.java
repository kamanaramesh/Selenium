package com.icici.loans.carloans;

public interface Rbi 
{
     public void withdrawl();
     public void deposit();
    
     public static void main(String[] args) 
     {
	
    	 
    	Rbi i;
    	
    	i=new Icici();
    	i.deposit();
    	i.withdrawl();
    	
    	}
     
}
