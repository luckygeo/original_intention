package me.common.utils;

import java.text.DecimalFormat;

/**
 * Created
 * 数字类工具
 */
public class NumUtils {

    /**
     * 格式化float为2位小数
     *
     * @param num
     *        需要格式的数字
     *
     * @return float
     *         返回格式后的数字
     *
     */
    public static float getDouble(float num) {
        DecimalFormat decimalFormat = new DecimalFormat(".00");
        return Float.parseFloat(decimalFormat.format(num));
    }
}
