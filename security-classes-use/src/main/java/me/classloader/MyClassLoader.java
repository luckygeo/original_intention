package me.classloader;

import javax.swing.JFrame;
import java.awt.EventQueue;

/**
 * Created
 * 编写自己的类加载器
 * 1.继承ClassLoader
 * 2.实现findClass(String name)
 */
public class MyClassLoader {


    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            JFrame frame = new ClassLoaderFrame();
            frame.setTitle("ClassLoaderTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }

}
