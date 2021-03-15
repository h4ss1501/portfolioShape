package com.company;

import java.awt.*;

public class Circle extends Shape {



    private Point center; //Point --> Consists of X,Y coordinates of the center of circle
    private double rad; //radius of a circle


    //constructor
    public Circle(Point cp, double radius) {
        this.center = cp;
        this.rad = radius;
    }


    @Override
    Point getCenter() {
        return center;
    }

    /*
    Method calculating area of a circle

   circle A = pi * rad^2

    Returns a double value.
    * */
    @Override
    double areaCalc() {
        return Math.PI * rad * rad;
    }

    /*
    Method calculating circumference of a rectangle

    C = 2 * PI * Radius

    Returns a double value.
    */
    @Override
    double circumCalc() {
        return 2 * Math.PI * rad;
    }

    @Override
    boolean isInside(Point point) {
        if (point.x <= (center.x + rad) && point.x >= (center.x - rad)
                && point.y <= (center.y + rad) && point.y >= (center.y - rad)){
        return true;
    }
    return false;
}
}
