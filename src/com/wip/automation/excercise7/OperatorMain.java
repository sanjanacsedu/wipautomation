package com.wip.automation.excercise7;

public class OperatorMain {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Operator addition = new AddOperator();
    System.out.println("Addition is: " + addition.execute(2, 3));
    System.out.println("Type is: " + addition.toString());

    Operator subtraction = new SubtractOperator();
    System.out.println("Subtraction is: " + subtraction.execute(5, 3));
    System.out.println("Type is: " + subtraction.toString());

    Operator multiplication = new MultiplyOperator();
    System.out.println("Multiplication is: " + multiplication.execute(4, 3));
    System.out.println("Type is: " + multiplication.toString());

    Operator division = new DivideOperator();
    System.out.println("Division is: " + division.execute(10, 3));
    System.out.println("Type is: " + division.toString());
  }

}
