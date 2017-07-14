package me.relations.reflections;

import java.util.Arrays;

/**
 * Created  反射
 *          1.在运行中分析类的能力
 *          2.在运行中查看对象，例如编写一个toString 提供所有类使用
 *          3.实现数组的操作代码
 *          4.利用method对象
 */
public class UsingClass {

    /**
     * 输出类的基本的信息
     *
     * @param cl
     *        class类
     */
    public static void printClassBaseInfo(Class cl){
        System.out.println(cl.getName());
        //getFields() 返回public 成员变量
        System.out.println(Arrays.toString(cl.getFields()));
    }
}
