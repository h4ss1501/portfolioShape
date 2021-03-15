package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle(new Point(5,10),5);
    }


    //Not sure how to define an object as an actual value ?
    @Test
    void getCenter() {

    }

    @Test
    //Passed
    void areaCalc() {
        assertEquals(circle.areaCalc(),78.53981633974483);
    }

    @Test
    //passed
    void circumCalc() {
        assertEquals(circle.circumCalc(),31.4159265);
    }

    @Test
    void isInside() {
    }
}