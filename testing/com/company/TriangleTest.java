package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle triangleT;

    @BeforeEach
    void setUp() {
        triangleT = new Triangle(new Point(15,15),new Point(23,30), new Point(50,25));

    }

    @Test
    void getCenter() {
    }

    @Test
    //passed
    void areaCalc() {
        assertEquals(triangleT.areaCalc(), 222.50);
    }

    @Test
    //passed
    void areaWithin() {
        assertEquals(triangleT.areaCalc(),222.50);
    }

    //passed
    @Test
    void circumCalc() {
        assertEquals(triangleT.circumCalc(),80.85960988189456);
    }

    @Test
    void isInside() {
    }
}