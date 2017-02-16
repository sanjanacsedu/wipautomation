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
    int addition = cal.addition(2, 3);
    System.out.println("Addition is: " + addition);
    int mod = cal.modulus(3, 2);
    System.out.println("Modulus is: " + mod);
    int subtract = cal.subtraction(5, 3);
    System.out.println("Subtraction is: " + subtract);
    int mult = cal.multiplication(2, 3);
    System.out.println("Multiplication is: " + mult);
    int div = cal.division(5, 3);
    System.out.println("Division is: " + div);
    int sq = cal.square(5);
    System.out.println("Square is: " + sq);

    Circle cir = new Circle(3);
    cir.area();
    cir.perimeter();
    int radius = cir.getRadius();
    System.out.println("Radius of the circle is: " + radius);
    System.out.println("Main method count is: " + Circle.count);


  }

}
