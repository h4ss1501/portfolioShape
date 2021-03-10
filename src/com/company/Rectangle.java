package com.company;

public class Rectangle extends Shape{

    private String name;


    public Rectangle(String name,int height, int width) {
        super(height, width);
        this.name = name;

    }

    @Override
    float AreaCalc() {
        return height * width;
    }

    @Override
    int getCenter() {
        return 0;
    }

    @Override
    int CircumCalc() {
        return 0;
    }

    @Override
    boolean isInsideShape() {
        return false;
    }
}
