package me.common.exception;

/**
 * Created by  on 2017/7/13 11:33.
 * 异常可能发生的情况
 */
public class CanCauseException {

    /**
     * 一个可能为 null 对象和 基本类型 作比较 则npe 异常
     *
     * @param interger
     * @param i
     * @throws java.lang.NullPointerException
     */
    public boolean integer_null_2(Integer interger, int i) throws java.lang.NullPointerException {
        //interger 为null npe
        return interger == i;
    }
}
