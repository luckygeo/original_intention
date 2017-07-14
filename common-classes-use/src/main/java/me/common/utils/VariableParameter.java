package me.common.utils;

/**
 * Created
 * 可变参数
 * @星期五
 */
public class VariableParameter {
    public static int getSum(int... ints){
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum;
    }
}
