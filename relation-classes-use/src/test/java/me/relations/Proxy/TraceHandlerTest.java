package me.relations.Proxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by gao on 2017/7/16 11:52.
 *
 * @星期日
 */
public class TraceHandlerTest {
    @Test
    public void invoke() throws Exception {
        Object[] elements = new Object[100];
        for (int i = 0; i < elements.length; i++) {
            Integer value = i + 1;
            InvocationHandler handler = new TraceHandler(value);
            Object proxy = Proxy.newProxyInstance(null, new Class[]{Comparable.class}, handler);
            System.out.println(Proxy.isProxyClass(elements.getClass()));
            elements[i] = proxy;
        }
        Integer key = new Random().nextInt(elements.length) + 1;
        System.out.println(key);
        int result = Arrays.binarySearch(elements, key);

        if (result>0)
            System.out.println(elements[result]);
    }

}