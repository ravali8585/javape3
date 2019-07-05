package com.stackroute.junitpe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleCatchTest {
    public static MultipleCatch multipleCatchDemo;

    @BeforeClass
    public static void setUp()
    {
        multipleCatchDemo = new MultipleCatch();
    }

    @AfterClass
    public static void tearDown()
    {
        multipleCatchDemo = null;
    }

    @Test
    public void testForMultipleCatchSuccess()
    {
        assertEquals("Null pointer Exception", multipleCatchDemo.handlingMultipleCatch(null));

        assertEquals("Index out of bound exception", multipleCatchDemo.handlingMultipleCatch("R@avali"));

        assertEquals("Negative Array Size Exception", multipleCatchDemo.handlingMultipleCatch("demo"));

        assertEquals(null, multipleCatchDemo.handlingMultipleCatch("stackroute"));

    }

    @Test
    public void testForMultipleCatchFailure()
    {
        assertEquals(null, multipleCatchDemo.handlingMultipleCatch("stackroute"));

    }


}