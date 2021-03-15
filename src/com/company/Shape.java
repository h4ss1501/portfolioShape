package com.company;

import java.awt.*;

//Inheriting by extending Point
abstract class Shape extends Point {


    //Returning center of a point
    abstract Point getCenter();

    //Calculate the area of a shape
     abstract double areaCalc();

    //Computing the circumference of a shape
    abstract double circumCalc();

    //Boolean returning true/false, whether a point is inside a shape or not.
    abstract boolean isInside(Point point);

    //Computing the euclidean distance between shapes (Center to center)
    double eucliDist(Shape shape){
        Point p = new Point();
        return p.distance(shape.getCenter().x,shape.getCenter().y,getCenter().x,getCenter().y);
    }



}