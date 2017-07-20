package me.classloader;

import sun.text.resources.cldr.saq.FormatData_saq;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by tgs on 2017/7/20 15:34.
 *
 * @星期四
 */
public class IClassLoader extends ClassLoader {

    /**
     * 为来自本地文件系统或其他来源，etc.网络 加载其字节码文件
     * 调用父类的defineClass 为其提供字节码
     *
     * @param name The <a href="#name">binary name</a> of the class
     * @return The resulting <tt>Class</tt> object
     * @throws ClassNotFoundException If the class could not be found
     * @since 1.2
     */
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] bytes = null;
        Class cl = null;
        try {
            bytes = Files.readAllBytes(Paths.get(name));
            cl = super.defineClass(null, bytes, 0, bytes.length);
            Method method = cl.getMethod("main", String[].class);
            try {
                /*这是因为编译器会把字符串数组当作一个可变长度参数传给对象o,而我们取得方法只有一个参数,所以就会出现wrong number of arguments的异常
                我们只要把字符串数组强制转换为一个Object对象就可以解决这个异常了.*/
               /// 01010101010101010101010101010101010
               //
               //
               //
               //
               //
               //    异常
               //
               //
               //
               //
               //
               //
               //  01010101010101010101010101010101010
                //method.invoke(null, new String[]{"this", "class", "using", "my", "classloader!"});
                Object obj = new String[]{"this", "class", "using", "my", "classloader!"};
                method.invoke(null, obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return cl;
    }
}
