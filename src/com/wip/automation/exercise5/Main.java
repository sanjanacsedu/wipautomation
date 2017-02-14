package com.wip.automation.exercise5;

import com.wip.training.types.Rectangle;

public class Main {

  public static void main(String[] args) {
    /*
     * Create a calculator class and implement methods for below operations Add methods - input two
     * integers Modulus method - input two integers Substract Multiply Division Square - input
     * single integer.
     */

    // TODO Auto-generated method stub
    Calculator cal = new Calculator();
    Calculator cal2 = new Calculator(3, 2);
    Calculator cal3 = new Calculator(3);
    cal.addition(2, 3);
    cal.modulus(3, 2);
    int subtract = cal2.subtraction();
    System.out.println("Subtraction is: " + subtract);
    cal2.multiplication();
    cal2.division();
    cal3.square();

    Circle cir = new Circle(3);
    cir.area();
    cir.perimeter();
    int radius = cir.getRadius();
    System.out.println("Radius of the circle is: " + radius);

  }

}
