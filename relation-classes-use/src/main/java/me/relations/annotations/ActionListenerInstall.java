package me.relations.annotations;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created
 *
 */
public class ActionListenerInstall {
    public static void processAnotation(Object obj) {
        try {
            Class cl = obj.getClass();
            for (Method m : cl.getDeclaredMethods()) {
                ActionListeners listener = m.getAnnotation(ActionListeners.class);
                if (listener != null) {
                    Field field = cl.getDeclaredField(listener.source());
                    field.setAccessible(true);
                    addListener(field.get(obj), obj, m);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addListener(Object source, final Object param, Method m) {
        InvocationHandler handler = (proxy, method, args) -> m.invoke(param);
        Object obj = Proxy.newProxyInstance(null, new Class[]{ActionListener.class}, handler);
        try {
            Method method = source.getClass().getMethod("addActionListener", ActionListener.class);
            method.invoke(source, obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
