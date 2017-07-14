package me.common.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tgs on 2017/7/14 15:49.
 *
 * @星期五
 */
public class NumUtilsTest {
    @Test
    public void getDouble() throws Exception {
        float d=NumUtils.getDouble((float)10 / 3);
        Integer integer1 = new Integer(1);
        integer1.intValue();
        // Integer.parseInt(String s,int radix) 目的是输出十进制数 ,redix 是说明s用几进制表示的
        System.out.println(Integer.parseInt("1010",2));

    }

}