package com.company;

public class Rectangle extends Shape{

    private String name;



    public Rectangle(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    @Override
    void AreaCalc() {
        System.out.println("The area of this Rectangle " + name + "´is " + x * y );
    }

    @Override
    double CircumCalc() {
        return 2*x+2*y;
    }

    @Override
    int getCenter() {
        return 0;
    }

    @Override
    boolean isInsideShape() {
        return false;
    }
}
