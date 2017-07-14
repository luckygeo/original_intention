package me.common.utils;

import java.text.DecimalFormat;

/**
 * Created by tgs on 2017/7/14 15:48.
 *
 * 数字类格式化类
 *
 * @星期五
 */
public class NumUtils {
    public static float getDouble(float num) {
        DecimalFormat decimalFormat = new DecimalFormat(".00");
        return Float.parseFloat(decimalFormat.format(num));
    }
}
