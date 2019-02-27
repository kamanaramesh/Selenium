package com.icici.loans.carloans;

public class Employee
{

	int eno;
	String ename;
	float sal;
	
	public  Employee()
	{
		System.out.println("Iam default constructor");
	}
	
	public Employee(int eno, String ename)
	{
		this(300);
		this.eno=eno;
		this.ename=ename;
		
				
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);

		
	}
	
	
	public Employee(int eno, String ename, float sal)
	{
		this(200,"ram");
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);

		
	}

	public Employee(int eno) 
	{
		this();
		this.eno=eno;
		

	
	}

	public static void main(String[] args)
	{
			Employee e1=new Employee(100,"ravilella",20000.00f);
			
			
			
			
			
			
			
		}

	}


