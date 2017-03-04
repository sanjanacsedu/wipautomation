package com.wip.automation.excercise7;

public class MultiplyOperator implements Operator {
  public int execute(int a, int b) {
    return a * b;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return getClass().toString();
    // return super.toString();
  }

}
