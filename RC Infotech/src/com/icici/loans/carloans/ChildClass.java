package com.icici.loans.carloans;


		public class ChildClass extends Employee
		{
			int X;
			
			public ChildClass(int X)
			{
				super(2,"abc",12.12f);
				
				this.X=X;
				System.out.println(this.X);
			}
			
			public static void main(String[] args)
			{
				ChildClass obj=new ChildClass(1);
				System.out.println(obj.X);
				
				
			}
			
	}


