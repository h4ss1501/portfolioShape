package com.company;

public class Circle extends Shape{

    private String name;
    private int rad;


    public Circle(int height, int width, int rad) {
        super(height, width);
        rad = this.rad;
    }

    @Override
    void AreaCalc() {
        System.out.println("The area for the circle " + name + " is " + Math.PI*rad*rad);
    }

    @Override
    int getCenter() {
        return 0;
    }

    @Override
    double CircumCalc() {
        return 2*Math.PI*rad;
    }

    @Override
    boolean isInsideShape() {
        return false;
    }
}
