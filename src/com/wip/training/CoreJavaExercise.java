package com.wip.training;

public class CoreJavaExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/*	
		Declare two integers and swap its values , ie x = 5; y = 10 =>  x=10; y = 5;
		Join first numbers with comma - like - 1,2,3,4,5,6….,100; 
		Convert given number of days into years months days. 
		Like for 450 days => 1 year 2 months 15 days.
		For a given number, print all digits and also calculate sum of digits.
		Print triangle with stars for a given numbers. Like for 5, the triangle is
		* * * * *
		* * * *
		* * *
		* *
		*
*/
		
		
		int x = 5;
		int y = 10;
		System.out.println("Before swap the value of x and y "+x +" "+y);
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		System.out.println("After swap the value of x and y "+x +" "+y);	
		//System.out.println(x +""+y);
		//String[] array = { "1", "2", "3" };
		//String merged = String.join(",", array);
        //System.out.println("merger with comma: "+" "+merged);
        
        
        //int[] num_array = {1,2,3,4,5};
        
        StringBuffer sb = new StringBuffer();
        for(int i = 1; i<= 100; i++)
        { sb.append(i);
          if(i < 100 )
        	  sb.append(',');
          else
        	  sb.append(';');
         }
        
        System.out.println(sb);
        
        
        
        int totalDays = 450;
        int year=totalDays/365;
        int remainder=totalDays%365;
        int month =remainder/30;
        int day = remainder%30;
        System.out.println("Total "+totalDays+" days equal to "+""+year+ " year "+month+" month "+day+" days");

		
		int number = 536;
		int sum = 0;
		while(number!=0)
		{
			int d = number%10;
			number = number/10;
			System.out.println(d);
			sum +=d;
		}
		
		System.out.println("summation of "+"number digits "+" "+sum);
		
		
		

		System.out.println("STAR PRINT");
		int n = 5;
		
	for (int i = n; i > 0; i--)
	{
	{   for(int j= i; j>=1; j-- )
		System.out.print("*");
	}
	System.out.print("\n");
	}
	
	
	
	}

}
