package com.company;

public class Circle extends Shape{

    private String name;

    public Circle(int height, int width) {
        super(height, width);
    }

    @Override
    float AreaCalc() {
        return 0;
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
