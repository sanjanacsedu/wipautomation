package com.wip.automation.exercise4;

import java.time.LocalDate;

public class ArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sumArray = new int[] { 2, 1, 5, 6 };
		int sum = 0;
		for (int i = 0; i < sumArray.length; i++)
			sum += sumArray[i];
		System.out.println("Summation is: " + sum);

		// Find minimum array elements

		int minimum = sumArray[0];
		for (int i = 1; i < sumArray.length; i++)
			if (minimum > sumArray[i])
				minimum = sumArray[i];
		System.out.println("Minimum element: " + minimum);

		// Find max array elements

		int max = sumArray[0];
		for (int i = 1; i < sumArray.length; i++)
			if (max < sumArray[i])
				max = sumArray[i];

		System.out.println("Maximum elemet: " + max);

		int[] originalArray = { 8, 12, 6, 5, 19 };
		int[] copyArray;
		int[] copyArrayEnd;
		copyArray = new int[originalArray.length];
		copyArrayEnd = new int[originalArray.length];

		for (int i = 0; i < originalArray.length; i++) {
			copyArray[i] = originalArray[i];
		}

		for (int i = originalArray.length - 1, j = 0; i >= 0; i--, j++) {
			copyArrayEnd[j] = originalArray[i];
		}

		System.out.println("copied array: ");
		for (int i = 0; i < copyArray.length; i++) {
			System.out.println(copyArray[i]);
		}
		System.out.println("reverse array: ");
		for (int i = 0; i < copyArrayEnd.length; i++) {
			System.out.println(copyArrayEnd[i]);
		}

	}

}
