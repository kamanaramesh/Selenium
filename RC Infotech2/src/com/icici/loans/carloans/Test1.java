package com.icici.loans.carloans;

public class Test1 {

	class Parent1
	{
		public  Number workhard()
		{
			System.out.println("wakeup early,gotocollege");
			return 10;
		}
		
		float care()
		{
			System.out.println("utmost care");
			return 10.5f;
		}
	}
	class Child1 extends Parent1
	{
		public Object workhard()
		{
			System.out.println("wakeup anytime,goto bar");
			return 20;
		}
		void love()
		{
			System.out.println("im in love");
		}
	}

	publicclass Test3 {

		publicstaticvoid main(String[] args) {
			// TODO Auto-generated method stub
			Parent1 p1=new Parent1();
			p1.workhard();//college method
			//if both reference type and object type
			//are same then same class method 
			//will be executed.
			
			Child1 c1=new Child1();
			c1.workhard();//bar method
			//if both reference type and object type
			//are same then same class method 
			//will be executed.
			
			Parent1 p2=new Child1();
			//parent class reference variable can     refer child class object
			p2.workhard();//bar method
			
			//p2.love();//CE
			
			p2.care();//valid
			
		}

	}
