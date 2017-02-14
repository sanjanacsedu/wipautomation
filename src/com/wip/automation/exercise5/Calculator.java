package com.wip.automation.exercise5;

public class Calculator {
  public int number1;
  public int number2;

  public Calculator() {
    // TODO Auto-generated constructor stub

  }

  public Calculator(int num1, int num2) {
    // TODO Auto-generated constructor stub
    number1 = num1;
    number2 = num2;
  }

  public Calculator(int num1) {
    // TODO Auto-generated constructor stub
    number1 = num1;

  }

  public void addition(int num1, int num2) {
    System.out.println("Summation is: " + (num1 + num2));

  }

  public void modulus(int num1, int num2) {
    System.out.println("Modulus is: " + (num1 % num2));

  }

  public int subtraction() {
    return number1 - number2;
  }


  public void multiplication() {
    System.out.println("multiplication is: " + (number1 * number2));

  }

  public void division() {
    System.out.println("division is: " + (number1 / number2));

  }

  public void square() {
    System.out.println("square is: " + (number1 * number1));

  }

}


