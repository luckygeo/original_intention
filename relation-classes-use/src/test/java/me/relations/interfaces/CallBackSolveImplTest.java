package me.relations.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gao on 2017/7/16 21:44.
 *
 * @星期日
 */
public class CallBackSolveImplTest {
    @Test
    public void slove() throws Exception {

        Li li = new Li();
        CallBackSolveImpl backSolve = new CallBackSolveImpl(li);
        backSolve.ask("1+1");

    }

}