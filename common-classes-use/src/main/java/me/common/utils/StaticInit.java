package me.common.utils;

/**
 * Created by on 2017/7/14 14:12.
 * java 类中执行顺序{
 * hello static   1.静态代码块   static{}
 * 不知道打印什么  2.初始化块    大括号内
 * 构造方法       3.构造方法
 * }
 *
 * @星期五
 */
public class StaticInit {


    public StaticInit() {
        System.out.println("构造方法");
    }

    {
        System.out.println("不知道打印什么");
    }

    static {
        System.out.println("hello static");
    }


}
