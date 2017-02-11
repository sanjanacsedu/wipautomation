package com.wip.automation.exercise4;

public class PrintDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println("Hello World");
		int[] originalArray = {};
		int n = 3456;
		int number = n;
		int i = 0;
		while (n != 0) {
			// int d = n %10;
			// originalArray[i] = d;
			n = n / 10;
			i++;
		}

		int[] copyArray;
		copyArray = new int[i];
		int j = 0;
		while (number != 0) {
			// System.out.println(number);
			int d = number % 10;
			copyArray[j] = d;
			// System.out.println(copyArray[j]);
			number = number / 10;
			j++;
		}

		for (int k = copyArray.length - 1; k >= 0; k--) {
			if (copyArray[k] == 0)
				System.out.println("zero");
			else if (copyArray[k] == 1)
				System.out.println("one");
			else if (copyArray[k] == 2)
				System.out.println("two");
			else if (copyArray[k] == 3)
				System.out.println("three");
			else if (copyArray[k] == 4)
				System.out.println("four");
			else if (copyArray[k] == 5)
				System.out.println("five");
			else if (copyArray[k] == 6)
				System.out.println("six");
			else if (copyArray[k] == 7)
				System.out.println("seven");
			else if (copyArray[k] == 8)
				System.out.println("eight");
			else if (copyArray[k] == 9)
				System.out.println("nine");

		}
	}

}
