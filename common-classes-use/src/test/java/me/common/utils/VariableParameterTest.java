package me.common.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tgs on 2017/7/14 20:38.
 *
 * @星期五
 */
public class VariableParameterTest {
    @Test
    public void getSum() throws Exception {
        assertEquals(15,VariableParameter.getSum(1, 2, 3, 4, 5));
    }

}