package me.common.utils;

import me.common.Model;

/**
 * Created on 2017/7/14 18:08.
 * 注 hashcode 默认是对象的存储地址
 * String 重写的equals 和 hashcode 方法 ,
 * empty string hashCode = 0;
 */
public class HashCodes {
    public static void main(String[] args) {
        String h = new String("OK");
        String s = "OK";
        System.out.println(h.hashCode());//2524
        System.out.println(s.hashCode());//2524
        StringBuffer stringBuffer1 = new StringBuffer("OK");
        StringBuffer stringBuffer2 = new StringBuffer("ER");
        System.out.println(stringBuffer1.hashCode());
        System.out.println(stringBuffer2.hashCode());
        Model m1 = new Model();
        Model m2 = new Model();
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        String dd = "";
        System.out.println("".hashCode());
    }
}
