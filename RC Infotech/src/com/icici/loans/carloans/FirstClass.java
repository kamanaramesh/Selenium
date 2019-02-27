package com.icici.loans.carloans;

public class FirstClass {
   int a=10,b=20,c;
   public void add()
   {
   c=a+b;
   System.out.println("addition of A & B is : " +c);
 }
   public void sub()
   {
	   c=a-b;
	   	System.out.println("sub of A & B is : " +c);
   }
   
   public static void main(String[] args)
   {
	   FirstClass c1=new FirstClass();
	   c1.add();
	   c1.sub();

   }
			   
   }
