package me.relations.annotations;

import javax.swing.JFrame;
import java.awt.EventQueue;

/**
 * Created
 *
 * @星期五
 */
public class RunJFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame buttonFrame = new ButtonFrame();
            buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            buttonFrame.setVisible(true);
        });
    }
}
