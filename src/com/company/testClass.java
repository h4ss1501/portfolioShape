package com.company;

import java.awt.*;

abstract class testClass {



    //variables
    public String name;
    public Point p1;
    public Point p2;

//constructor


    public testClass(String name, Point p1, Point p2) {
        this.name = name;
        this.p1 = p1;
        this.p2 = p2;
    }

    public testClass(String name, Point p1){
        this.name = name;
        this.p1 = p1;
    }

    //methods
    //Calculate the area of a shape
    abstract void AreaCalc();

    //Calculate the circumference
    abstract void CircumCalc();

    //Getting the center of a shape
    abstract void getCenter();

}
