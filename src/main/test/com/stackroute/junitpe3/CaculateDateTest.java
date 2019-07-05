package com.stackroute.junitpe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class CaculateDateTest {
    CaculateDate weekDay;
    @Before
    public void setUp() throws Exception {
        weekDay=new CaculateDate();
    }

    @After
    public void tearDown() throws Exception {
        weekDay=null;
    }

    @Test
    public void firstDayOfWeek() throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("E dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("dd/MM/yyyy");
        String expected= "Mon 24/07/2017";
        Date actual=weekDay.firstDayOfWeek(simpleDateFormat1.parse("27/07/2017"));
        assertEquals(expected,simpleDateFormat.format(actual));
    }

    @Test
    public void firstDayOfWeekNotNull() throws ParseException {

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("E dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("dd/MM/yyyy");
        Date actual=weekDay.firstDayOfWeek(simpleDateFormat1.parse("27/07/2017"));
        assertNotNull(simpleDateFormat.format(actual));
    }



    @Test
    public void lastDayOfWeek() throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("E dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("dd/MM/yyyy");
        String expected= "Sun 30/07/2017";
        Date actual=weekDay.lastDayOfWeek(simpleDateFormat1.parse("27/07/2017"));
        assertEquals(expected,simpleDateFormat.format(actual));
    }

}