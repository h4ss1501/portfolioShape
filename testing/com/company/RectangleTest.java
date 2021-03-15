package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle rectTest;

    @BeforeEach
    void setUp() {
        rectTest = new Rectangle(new Point(4,3),10,20);
    }

    @Test
    void getCenter() {
    }

    @Test
    //passed
    void areaCalc() {
        assertEquals(rectTest.areaCalc(),200);
    }

    @Test
    //passed
    void circumCalc() {
        assertEquals(rectTest.circumCalc(),60);

    }

    @Test

    void isInside() {
    }
}