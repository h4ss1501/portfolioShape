package com.company;

import java.awt.*;

public class Circle extends Shape {

    //missing methods
    // -isInside


    private Point c; //Point --> Consists of X,Y coordinates of the center of circle
    private double rad; //radius of a circle


    //constructor
    public Circle(Point center, double radius) {
        this.c = center;
        this.rad = radius;
    }


    @Override
    Point getCenter() {
        return c;
    }




    //Returns the calculated area of a circle A = pi * rad^2
    @Override
    double AreaCalc() {
        return Math.PI * rad * rad;
    }

    //Returns the circumference of a circle C = 2 * Pi * Radius
    @Override
    double circumCalc() {
        return 2 * Math.PI * rad;
    }

    @Override
    boolean isInside(Point point) {
        return false;
    }

}
