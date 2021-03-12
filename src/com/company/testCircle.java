package com.company;

import java.awt.*;

public class testCircle extends testClass {

    private int rad;

    public testCircle(String name, Point p1,int radius) {
        super(name, p1);
        rad = radius;

    }

    @Override
    void AreaCalc() {
        System.out.println("The area of the Circle " + name + ": " + Math.PI*rad*rad);

    }

    @Override
    void CircumCalc() {
        System.out.println("The circumference of the Circle " + name + ": " + 2*Math.PI*rad);

    }

    @Override
    void getCenter() {
        System.out.println("The center of the circle is " + p1.getX());

    }
}
