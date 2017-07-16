package me.common.debugs;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by gao on 2017/7/16 16:32.
 *
 * @星期日
 */
public class Loggers {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Loggers.class.getName());
        logger.setLevel(Level.FINEST);
        String name = "liu";
        int age = 18;
        logger.info("name: " + name + ", age: " + age);
        logger.fine("name: " + name + ", age: " + age);
        logger.finest("name: " + name + ", age: " + age);

    }
}
