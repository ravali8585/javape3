package com.stackroute.junitpe3;

import java.util.Calendar;
import java.util.Date;

public class CaculateDate {
    public Date firstDayOfWeek(Date date){
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        // Set the calendar to monday of the current week
        calendar.set(Calendar.DAY_OF_WEEK,calendar.getFirstDayOfWeek());
        return calendar.getTime();
    }

    public Date lastDayOfWeek( Date date){
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        // Set the calendar to monday of the current week
        calendar.set(Calendar.DAY_OF_WEEK,calendar.SUNDAY);
        return calendar.getTime();
    }

}
