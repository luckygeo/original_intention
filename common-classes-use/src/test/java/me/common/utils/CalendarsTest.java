package me.common.utils;

import org.junit.Before;
import org.junit.Test;

import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Date;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by gao on 2017/7/6.
 */
public class CalendarsTest {


    private Calendars calendars;

    @Before
    public void init(){
        calendars = new Calendars();
    }

    @Test
    public void simplFormat() throws Exception {
        Date date = null;
        assertEquals("2017-07-06",calendars.simplFormat(new Date(), "yyyy-MM-dd"));

    }

    @Test
    public void getYear() throws Exception {
        assertEquals("2017", String.valueOf(calendars.getYear()));
        String[] months = new DateFormatSymbols().getShortMonths();
        String[] weeks = new DateFormatSymbols().getShortWeekdays();
        System.out.println(Arrays.toString(months));
        System.out.println(Arrays.toString(weeks));
    }

}