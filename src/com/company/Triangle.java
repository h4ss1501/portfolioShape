package com.company;
import java.lang.Math.*;

public class Triangle extends Shape{

    private String name;

    public Triangle(String name,int height, int width) {
        super(height, width);
        this.name = name;
    }

    @Override
    float AreaCalc() {
        return (float) (0.5 * width * height);
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
