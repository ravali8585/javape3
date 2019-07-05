package com.stackroute.junitpe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionTest {
    public static ExceptionDemo exceptionHandlingDemo;

    @BeforeClass
    public static void setUp()
    {
        exceptionHandlingDemo = new ExceptionDemo();
    }

    @AfterClass
    public static void tearDown()
    {
        exceptionHandlingDemo = null;
    }

    @Test
    public void testForExceptionHandlingSuccess()
    {
        assertEquals("finally block", exceptionHandlingDemo.throwException(2));

        assertEquals("finally block", exceptionHandlingDemo.throwException(13));

        assertEquals("finally block", exceptionHandlingDemo.throwException(10));
    }

}