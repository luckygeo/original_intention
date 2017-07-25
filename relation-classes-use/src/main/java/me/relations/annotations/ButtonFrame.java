package me.relations.annotations;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

/**
 * Created
 *
 */
public class ButtonFrame extends JFrame {

    public static final int WIDTH = 500;

    public static final int HEIGH = 500;

    public JPanel panel;

    public JButton yellow;

    public JButton blue;

    public JButton red;

    public ButtonFrame(){
        init();
    }

    public void init(){
        setSize(WIDTH, HEIGH);
        panel = new JPanel();
        add(panel);
        yellow = new JButton("Yellow");
        blue = new JButton("Blue");
        red = new JButton("Red");
        panel.add(yellow);
        panel.add(blue);
        panel.add(red);
        ActionListenerInstall.processAnotation(this);
    }

    @ActionListeners(source = "yellow")
    public void setYellowBg(){
        panel.setBackground(Color.YELLOW);
    }

    @ActionListeners(source = "blue")
    public void setBlueBg(){
        panel.setBackground(Color.BLUE);
    }

    @ActionListeners(source = "red")
    public void setRedBg(){
        panel.setBackground(Color.RED);
    }


}
