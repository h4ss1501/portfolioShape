package com.company;

import java.awt.*;

public class Triangle extends Shape{



    //instance var
    //Triangle consists of 3 Points
    //Each point consists of x,y coordinates on a cartesian plane.
    private Point A;
    private Point B;
    private Point C;

    //constructor
    //taking 3 points
    public Triangle(Point a, Point b, Point c){
        A = a;
        B = b;
        C = c;
    }


    /*
    Returns the center-coordinates of a point

    * */

    @Override
    public Point getCenter() {
        Point center = new Point();
        //for x-val
        center.x = (A.x+B.x+ C.x)/3;
        //for y-val
        center.y = (A.y+B.y+C.y)/3;
        return  center;
    }

    @Override
    /*
    * Method calculating the area of a triangle
    *
    * Area = [x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2)]/2.0
    *
    * Returns the area value as double
    * */


    double areaCalc() {
        return Math.abs((A.x*(B.y-C.y)+B.x*(C.y-A.y)+C.x*(A.y-B.y))/2.0);
    }

    /*
    * Area calculation: Takes the 3 points of a triangle as parameters,
    * returns the absolute value of an area of triangle
    * */
    double AreaWithin(Point p1, Point p2, Point p3) {
        double calc = Math.abs((p1.x*(p2.y-p3.y)+p2.x*(p3.y-p1.y)+p3.x*(p1.y-p2.y))/2.0);
        return  calc;
    }

    @Override
    /*Calculating the perimeter of a Triangle

    returning a double
    */
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
    /*
    Boolean method, checks is a given point is within the shape
    Returns true if it is, otherwise false
    * */
    boolean isInside(Point point) {

        //calculate the area
        double in = areaCalc();

        //calculate the distance between new point and the 2 remaining points.
        double s1 = AreaWithin(point,A,B);
        double s2 = AreaWithin(point,A,C);
        double s3 = AreaWithin(point,B,C);

        //summing up the newly calculated area
        double aTotal = s1+s2+s3;


        //Checks is if the total is within the originally calculated area or not
        //true if point is in, else false.
        return aTotal == in;
    }

}


