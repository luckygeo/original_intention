package me.classloader;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by tgs on 2017/7/20 15:49.
 *
 * @星期四
 */
public class IClassLoaderTest {
    @Test
    public void findClass() throws Exception {
        //Scanner scanner = new Scanner(System.in);
        //String file = scanner.next();
        ClassLoader classLoader = new IClassLoader();
        Class cl = classLoader.loadClass("D:/Cl.class");
        /*参数：
            name - 方法名
            parameterTypes - 参数列表
            */
        Method method = cl.getMethod("run1",String.class);
        method.invoke(null, (Object) null);
    }

}