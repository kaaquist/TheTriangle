package com.tradeshift;

import org.junit.Ignore;

import static org.junit.Assert.*;

/**
 * Created by kasper on 04/04/16.
 * Test class for TheTriangle class
 */
public class TriangleTest {

    @org.junit.Test
    public void testGetSideA() throws Exception {
        System.out.print("NO!!!");
        Triangle triangle = new Triangle(1,1,1);
        assertEquals(triangle.getSideA(), 1L);

    }

    @org.junit.Test
    public void testGetSideB() throws Exception {
        Triangle triangle = new Triangle(1,1,1);
        assertEquals(triangle.getSideB(), 1L);

    }


    @org.junit.Test
    public void testGetSideC() throws Exception {
        Triangle triangle = new Triangle(1,1,1);
        assertEquals(triangle.getSideC(), 1L);
    }

    @org.junit.Test
    public void testIsEquilateral() throws Exception {

        Triangle triangle = new Triangle(1,1,1);
        assertEquals(triangle.isEquilateral(), true);
    }

    @org.junit.Test
    public void testIsIsosceles() throws Exception {
        Triangle triangle = new Triangle(1,2,1);
        assertEquals(triangle.isIsosceles(), true);
    }

    @org.junit.Test
    public void testIsScalene() throws Exception {
        Triangle triangle = new Triangle(1,2,3);
        assertEquals(triangle.isScalene(), true);
    }
}