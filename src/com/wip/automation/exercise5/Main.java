package com.wip.automation.exercise5;

import com.wip.training.types.Rectangle;

public class Main {

  public static void main(String[] args) {
    /*
     * Create a calculator class and implement methods for below operations Add methods - input two
     * integers Modulus method - input two integers Substract Multiply Division Square - input
     * single integer.
     */
    Calculator cal = new Calculator();
    cal.addition(2, 3);
    cal.modulus(3, 2);
    int subtract = cal.subtraction(5,3);
    System.out.println("Subtraction is: " + subtract);
    cal.multiplication(2,3);
    cal.division(5,3);
    cal.square(5);

    Circle cir = new Circle(3);
    cir.area();
    cir.perimeter();
    int radius = cir.getRadius();
    System.out.println("Radius of the circle is: " + radius);

  }

}
