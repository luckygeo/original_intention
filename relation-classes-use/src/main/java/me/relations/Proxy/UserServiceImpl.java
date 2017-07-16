package me.relations.Proxy;

import me.relations.interfaces.UserService;

/**
 * Created by gao on 2017/7/16 14:34.
 *
 * @星期日
 */
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        System.out.println("getName");
        return "Jelly";
    }

    @Override
    public int getAge() {
        System.out.println("getAge");
        return 00;
    }
}
