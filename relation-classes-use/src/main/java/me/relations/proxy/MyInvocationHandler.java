package me.relations.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by gao on 2017/7/16 14:36.
 *
 * @星期日
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object object;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("getName".equals(method.getName())) {
            System.out.println("before: " + method.getName());
            Object re = method.invoke(object, args);
            System.out.println("after: " + method.getName());
            return re;
        }
        else {
            return method.invoke(object,args);
        }

    }
}
