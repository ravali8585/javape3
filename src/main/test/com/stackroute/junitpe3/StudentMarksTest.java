package com.stackroute.junitpe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    private static StudentMarks studentMarks;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        studentMarks = null;
    }

    @Test
    public void toCheckGradesShouldReturnTrue() {
//        arrange
        studentMarks = new StudentMarks(2, new int[]{30, 60});
        boolean expected = true;
        boolean actual = studentMarks.checkGrades();

        assertEquals(expected, actual);


    }

    @Test
    public void toChecheckGradesShouldreturnFalse() {
//        arrange
        studentMarks = new StudentMarks(3, new int[]{30, 60, 110});
        boolean expected = false;
        boolean actual = studentMarks.checkGrades();

        assertEquals(expected, actual);
    }

}