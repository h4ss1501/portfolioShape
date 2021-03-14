package com.company;

import java.awt.*;

//Inheriting by extending Point
abstract class Shape extends Point {


/*
    //variables
    public String name;
    public Point p1;
    public Point p2;

//constructor


    public AShape(String name, Point p1, Point p2) {
        this.name = name;
        this.p1 = p1;
        this.p2 = p2;
    }

    public AShape(String name, Point point){
        this.name = name;
        this.p1 = point;
    }
*/



    //methods

    //Returning center of a point
    abstract Point getCenter();

    //Calculate the area of a shape
    abstract double AreaCalc();

    //Computing the circumference of a shape
    abstract double circumCalc();

    //Boolean returning true/false, whether a point is inside a shape or not.
    abstract boolean isInside(Point point);

    //Computing the euclidean distance between shapes (Center to center)
    double eucliDist(Shape shape){
        Point p = new Point();
        return p.distance(shape.getCenter().x,shape.getCenter().y,getCenter().x,getCenter().y);
    }



    /*
    //Calculate the circumference
    abstract void CircumCalc();
*/


}