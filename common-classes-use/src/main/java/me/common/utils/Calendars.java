package me.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by  on 2017/7/6.
 * 和日期相关的类的使用方法
 *
 */
public class Calendars {

    /**
     * 简单格式化日期
     *
     * @param date
     *          要格式化的日期
     * @param pattern
     *          格式化的规则 "yyyy-MM-dd HH:mm:ss"
     */
    public String simplFormat(Date date, String pattern){
        return new SimpleDateFormat(pattern).format(date);
    }

    public int getYear(){
        GregorianCalendar gre = new GregorianCalendar();
        return gre.get(Calendar.YEAR);
    }
}
