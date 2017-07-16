package me.relations.interfaces;

import me.common.utils.Calendars;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by gao on 2017/7/16 9:58.
 *
 * @星期日
 */
public class InnerClass {
    public void start(){
        ActionListener actionListener = new me.relations.interfaces.CallBackTimerPrinter();
        Timer t = new Timer(1000, actionListener);
        t.start();
        JOptionPane.showMessageDialog(null, "quit?");
        System.exit(0);
    }
    public class CallBackTimerPrinter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Calendars calendars = new Calendars();
            System.out.println(calendars.simplFormat(new Date(),"yyyy-MM-dd HH:mm:ss"));
            Toolkit.getDefaultToolkit().beep();
        }
    }
}
