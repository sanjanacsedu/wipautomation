/**
 * 
 */
package com.wip.training;

/**
 * @author nafiurrashid
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World Sanjana");
		
		int age = 25;
		float price =  20.99f;
		int noMonths = 12;
		char a = 'a';
		boolean isDamaged = true;
		int bookCount = 2;
		char foodTypeVeg = 'V';
		char food_type_non_veg = 'N';
		boolean isActive = true;
		float pizzaCost = 6.67f;
		int year = 2017;
		String day = "Sunday";
		
		//System.out.println("Cost of the pizza is "+pizzaCost);
		
		
		
	/*	
		1)  Week has 7 days 
		2)  Each pizza slices is 7.86 dollars
		3)  First letter of India is I.
		4)  My name is <write your name>
		5)  I took 2 days off.
		6)  Length of my name is 10 letters. // use string length to find the length.
		7)  10 apps installed in my phone. 
		8)  So far, I read 10 pages.
		*/
		int week = 7;
		float pizzaSlice =  7.86f;
		char firstLetterIndia = 'I';
		String myName = "Sanjana Rahman";
		int daysOff = 2;
		int lengthName = myName.length();
		int appsCount = 10;
		int pages = 10;
		
		
		System.out.println("Week has "+week+""+" days");
		System.out.println("Each pizza slices is "+pizzaSlice+""+"  dollars");
		System.out.println("First letter of India is "+firstLetterIndia);
		System.out.println("My name is "+myName);
		System.out.println("I took "+daysOff+" "+"days off");
		System.out.println("Length of my name is  "+lengthName+" letters");
		System.out.println(appsCount+ " apps installed in my phone.");
		System.out.println("So far I read "+pages+""+" pages");

	}

}
