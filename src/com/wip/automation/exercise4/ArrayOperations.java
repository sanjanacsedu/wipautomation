package com.wip.automation.exercise4;

import java.time.LocalDate;

public class ArrayOperations {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] originalArray = new int[] {2, 1, 5, 6};
    
    int result = sumArray(originalArray);
    System.out.println("sum is " + result);
    
    // Find minimum array elements
    int minimum = minimum(originalArray);
    System.out.println("Minimum element: " + minimum);

    // Find max array elements
    int max = maximum(originalArray);
    System.out.println("Maximum elemet: " + max);



    int[] copiedArray = copytoArray(originalArray);
    System.out.println("copied array: ");
    for (int i = 0; i < copiedArray.length; i++) {
      System.out.println(copiedArray[i]);
    }

    int[] copyArrayEnd = copytoArrayEnd(originalArray);
    System.out.println("reverse array: ");
    for (int i = 0; i < copyArrayEnd.length; i++) {
      System.out.println(copyArrayEnd[i]);
    }

  }

  static int minimum(int[] originalArray) {
    // System.out.println("Hello world");
    int minimum = originalArray[0];
    for (int i = 1; i < originalArray.length; i++)
      if (minimum > originalArray[i])
        minimum = originalArray[i];
    return minimum;
  }


  static int maximum(int[] originalArray) {
    // System.out.println("Hello world");
    int max = originalArray[0];
    for (int i = 1; i < originalArray.length; i++)
      if (max < originalArray[i])
        max = originalArray[i];
    return max;
  }


  static int sumArray(int[] originalArray) {
    // System.out.println("Hello world");
    int sum = 0;
    for (int i = 0; i < originalArray.length; i++)
      sum += originalArray[i];
    return sum;
  }



  static int[] copytoArray(int[] originalArray) {
    // System.out.println("Hello world");
    int[] copyArray = new int[originalArray.length];
    for (int i = 0; i < originalArray.length; i++) {
      copyArray[i] = originalArray[i];
    }
    return copyArray;
  }


  static int[] copytoArrayEnd(int[] originalArray) {
    // System.out.println("Hello world");
    int[] copyArrayEnd = new int[originalArray.length];
    for (int i = originalArray.length - 1, j = 0; i >= 0; i--, j++) {
      copyArrayEnd[j] = originalArray[i];
    }
    return copyArrayEnd;
  }



}
