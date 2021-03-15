package com.company;

import java.awt.*;

public class Rectangle extends Shape{

        //Missing methods
        // -isInside boolean

    //fields
    Point coordinates; // XY coordinate values on a cartesian plane
    double height; //height of a rectangle
    double width; //width of a rectangle

    //constructor
    public Rectangle(Point p, double height,double width){
        this.coordinates = p;
        this.height = height;
        this.width = width;
    }


    @Override
    //Returns the center
    //xCenter = (x1 + width) / 2
    //yCenter = (y1 + height) / 2
    Point getCenter() {
        Point center = new Point();
        center.x = (int) ((this.coordinates.x + width) /2);
        center.y = (int) ((this.coordinates.x + height) / 2);

        return center;
    }

    @Override
    /*
    Method calculating area of a rectangle

    A = height * width

    Returns a double value.
    * */
    double areaCalc() {
        return height * width;
    }


    /*
    Method to calculate the circumference of a rectangle

    C = 2(W+H)

    Returns a double value.
    * */
    double circumCalc() {
        return 2 * (width + height);
    }

    @Override
    boolean isInside(Point point) {

        //bottom-left
        //top-right

        if(point.x >= coordinates.x && point.y >= coordinates.y && point.x <=(coordinates.x +width)
                && point.y <=(coordinates.y+height)) {
            return true;
        }
        return  false;


    }


}

