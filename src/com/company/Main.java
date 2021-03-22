package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {


        //testing
        Circle circ = new Circle(new Point(4,4),2);

        System.out.println("The area of a circle is " + circ.areaCalc());

        Rectangle rect = new Rectangle(new Point(5,7),10,15);

        System.out.println("The circumference of a rectangle is " + rect.circumCalc());

        System.out.print(circ.isInside(new Point(2,2)));
        System.out.println ("The are of the Rectangle");

    }
}
