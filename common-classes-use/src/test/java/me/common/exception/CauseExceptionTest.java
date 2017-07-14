package me.common.exception;

import org.junit.Test;

/**
 * Created by tgs on 2017/7/13 11:36.
 *
 * @星期四
 */
public class CauseExceptionTest {
    @Test
    public void integer_null_2(){
        CanCauseException causeException = new CanCauseException();
        Integer interger = new Integer(1);
        try {
            causeException.integer_null_2(null, interger);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}