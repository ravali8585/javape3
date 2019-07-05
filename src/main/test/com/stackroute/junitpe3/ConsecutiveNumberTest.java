package com.stackroute.junitpe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumberTest {
    ConsecutiveNumber number;
    @Before
    public void setUp() throws Exception {
        number=new ConsecutiveNumber();
    }

    @After
    public void tearDown() throws Exception {
        number=null;
    }

    @Test
    public void toCheckConsecutiveNumbersShouldReturnFalse() {
        boolean expected=false;
        boolean actual=number.checkConsecutive("98,96,95,94,93");
        assertEquals(expected,actual);

    }

    @Test
    public void toCheckConsecutiveNumbersShouldReturnTrue() {
        boolean expected=true;
        boolean actual=number.checkConsecutive("54,53,52,51,50,49,48");
        assertEquals(expected,actual);

    }

}