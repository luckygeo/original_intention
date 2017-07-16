package me.relations.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by gao on 2017/7/16 11:29.
 *
 * 代理类的使用
 *
 * @星期日
 */
public class TraceHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.print(target);
        System.out.print("." + method.getName()+"(");
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i < args.length - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println(");");
        return method.invoke(target, args);
    }

    public TraceHandler(Object o) {
        target = o;
    }

    private Object target;
}
