package com.wip.automation.excercise7;

public class MultiplyOperator implements Operator {
  public int execute(int num1, int num2) {
    return num1 * num2;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return getClass().toString();
    // return super.toString();
  }

}
