package me.relations.interfaces;

import me.common.utils.Calendars;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by gao on 2017/7/16 9:35.
 *
 * @星期日
 */
public class CallBackTimerPrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Calendars calendars = new Calendars();
        System.out.println(calendars.simplFormat(new Date(),"yyyy-MM-dd HH:mm:ss"));
        Toolkit.getDefaultToolkit().beep();
    }
}
