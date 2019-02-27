package com.icici.loans.carloans;

public class Emp 
{
	int a,b,c;
	

	
	public Emp(int a, int b)
	{
		this.a=a;
		this.b=b;
		
	}
	public void add()
	{
		c=a+b;
		System.out.println("ADD :" +c);
		
	}
    public void sub()
    {

		c=a-b;
		System.out.println("SUB :" +c);
		
    }
	public static void main(String[] args)
	{
		Emp e1=new Emp(10,20);
		e1.add();
		e1.sub();
		
		
	}

}
