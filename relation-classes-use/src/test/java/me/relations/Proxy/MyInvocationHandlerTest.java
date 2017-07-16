package me.relations.Proxy;

import me.relations.interfaces.UserService;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

/**
 * Created by gao on 2017/7/16 14:44.
 *
 * @星期日
 */
public class MyInvocationHandlerTest {
    @Test
    public void invoke() throws Exception {
        UserService userService = new UserServiceImpl();
        InvocationHandler handler = new MyInvocationHandler(userService);
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), handler);
        System.out.println(userServiceProxy.getName());
        System.out.println(userService.getAge());
    }

}