package com.wip.training;

public class LoopExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Please complete below assignments before next class.

		What is post increment or pre increment. 
		Take two variable x & y and assign integer numbers then calculate    
		Find value of (x+y)(x+y) 
		Find x%y;
		Find 2x + y;
		Find the sum of first N natural number ( 1- 100)
		Find the sum of even numbers in N natural numbers ? 
		Hint: how to find a number is even or odd 
		Print 2 table using while loops. Example:     
		“1 * 2 = 2”
		“2 * 2 = 4”
		---
		---
		“10 * 2 = 20”
*/
		
		int x = 2;
		int y = 3;
		int z = (x+y)*(x+y) ;
		float mod = x%y;
		int var = 2*x + y;
		System.out.println("value of (x+y)(x+y) =   "+z);
		System.out.println("value of x%y =   "+mod);
		System.out.println("value of 2x + y =   "+var);
		
		int sum = 0 ;
		int num = 100;
		for(int i = 1; i<= num ; i++)
			sum +=i;
		
		System.out.println("sum is =   "+sum);
		
		
		int sumEvenNumber = 0;
		for(int i = 1; i<= num ; i++)
			if(i%2 == 0 )
				sumEvenNumber +=i;
		System.out.println("sum of even numbers is =   "+sumEvenNumber);
		
		
		
		/*
		 * Print 2 table using while loops. Example:     
		“1 * 2 = 2”
		“2 * 2 = 4”
		---
		---
		“10 * 2 = 20”
		 */
		System.out.println("multiplication table using while loop");
		int i = 1;
		int j = 2;
		while (i <= 10)
		{
			int k = i*j;
		System.out.println(i + " * "+j+ " = " + k);
		i++;
		}
		
		
		System.out.println("summation table using while loop");
		int l = 1;
		int m = 2;
		while (m <= 10)
		{
			int k = l+m;
		System.out.println(l + " + "+m+ " = " + k);
		m++;
		}
		
	}

}
