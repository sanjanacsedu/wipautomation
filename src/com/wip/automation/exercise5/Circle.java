package com.wip.automation.exercise5;



// Also, create a circle class with given radius and calculate area & perimeter & getRadious

public class Circle {
  public int radius;
  public static int count = 0;



  public Circle(int rad) {
    // TODO Auto-generated constructor stub
    radius = rad;
    count++;

  }


  public void area() {
    System.out.println("Area of the circle is: " + (3.142 * radius * radius));

  }

  public void perimeter() {
    System.out.println("Perimeter of the circle is: " + (3.142 * 2 * radius));

  }

  public int getRadius() {
    return radius;

  }



}
