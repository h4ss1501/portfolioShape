package com.company;

import java.awt.*;

public class Main {

    public void displayArea(Shape shape){
        //toString method
    }

    public static void main(String[] args) {
	// write your code here
/*
        Shape[] shapeArr = new Shape[5];
        shapeArr[0] = new Rectangle("Rectangle",10,20);



*/

        //testing
        Circle circ = new Circle(new Point(4,4),2);

        System.out.println("The area of a circle is " + circ.AreaCalc());

        Rectangle rect = new Rectangle(new Point(5,7),10,15);

        System.out.println("The circumference of a rectangle is " + rect.circumCalc());

    }
}
