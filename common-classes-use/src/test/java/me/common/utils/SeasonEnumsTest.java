package me.common.utils;

import me.common.enums.SeasonEnums;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by tgs on 2017/7/14 20:53.
 *
 * @星期五
 */
public class SeasonEnumsTest {
    @Test
    public void testNum(){
        SeasonEnums spring =SeasonEnums.SPRING;
        System.out.println(spring.toString());
        System.out.println(SeasonEnums.SPRING.ordinal());//返回顺序
        System.out.println(Arrays.toString(SeasonEnums.values()));//调用头String
        SeasonEnums d = Enum.valueOf(SeasonEnums.class,"SUMMER");
        System.out.println(d.toString());


    }

}