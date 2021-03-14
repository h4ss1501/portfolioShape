package com.company;

import java.awt.*;

public class Triangle extends Shape{


    //Missing Methods
    //Is inside


    //instance var
    //Triangle consists of 3 Points
    //Each point consists of x,y coordinates on a cartesian plane.
    private Point A;
    private Point B;
    private Point C;

    //constructors


    //taking 3 points
    public Triangle(Point a, Point b, Point c){
        A = a;
        B = b;
        C = c;
    }
/*
    //taking x-y val & base height
    public Triangle(int x, int y, int base, int height){
        A = new Point(x,y);
        B = new Point(x+base,y-height/2);
        C = new Point(x+base,y+height/2);
    }
*/


    //write comment for this
    @Override
    Point getCenter() {
        Point center = new Point();
        //for x-val
        center.x = (A.x+B.x+ C.x)/3;
        //for y-val
        center.y = (A.y+B.y+C.y)/3;
        return  center;
    }

    @Override
    double AreaCalc() {
       //returns the absolute valute
        double calc = Math.abs((A.x*(B.y-C.y)+B.x*(C.y-A.y)+C.x*(A.y-B.y))/2.0);
        return  calc;
    }

    @Override
    //Calculating the perimeter of a Triangle
    double circumCalc() {

        //Using .distance method to calculate the distance between the 3 points of a triangle
        double disAB = Point.distance(A.x, A.y, B.x, B.y);
        double disAC = Point.distance(A.x, A.y, C.x, C.y);
        double disBC = Point.distance(B.x, B.y, C.x, C.y);
        double perimeter = disAB + disAC + disBC;
        //returns the perimeter = sum of all distance between points.
        return perimeter;
    }

    @Override
    boolean isInside(Point point) {
        return false;
    }

}


