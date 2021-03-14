package com.company;

import java.awt.*;

public class Rectangle extends Shape{

        //Missing methods
        // -isInside boolean

    //fields
    Point point; // XY coordinate values on a cartesian plane
    double height; //height of a rectangle
    double width; //width of a rectangle

    //constructor
    public Rectangle(Point p, double height,double width){
        this.point = p;
        this.height = height;
        this.width = width;
    }


    @Override
    //Returns the center
    //xCenter = (x1 + width) / 2
    //yCenter = (y1 + height) / 2
    Point getCenter() {
        Point center = new Point();
        center.x = (int) ((this.point.x + width) /2);
        center.y = (int) ((this.point.x + height) / 2);

        return center;
    }

    @Override
    /*
    Method calculating area of a rectangle

    A = height * width
    * */
    double AreaCalc() {
        return height * width;
    }


    /*
    Method to calculate the circumference of a rectangle

    C = 2(W+H)
    * */
    double circumCalc() {
        return 2 * (width + height);
    }

    @Override
    boolean isInside(Point point) {
        return false;
    }


}
