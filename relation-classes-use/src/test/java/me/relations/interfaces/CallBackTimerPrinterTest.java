package me.relations.interfaces;

import org.junit.Test;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import static org.junit.Assert.*;

/**
 * Created by gao on 2017/7/16 9:42.
 *
 * @星期日
 */
public class CallBackTimerPrinterTest {
    @Test
    public void actionPerformed() throws Exception {
        ActionListener actionListener = new CallBackTimerPrinter();
        Timer t = new Timer(1000, actionListener);
        t.start();
        JOptionPane.showMessageDialog(null, "quit");
        System.exit(0);
    }
    @Test
    public void actionPerforme1(){
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
    }

}