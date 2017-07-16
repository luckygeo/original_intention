package me.theads;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gao on 2017/7/16 19:48.
 *
 * @星期日
 */
public class VedioTest {
    @Test
    public void run() throws Exception {
        Runnable mp3 = new Mp3();
        Runnable vedio = new Vedio();
        Thread playMp3 = new Thread(mp3);
        Thread playVedio = new Thread(vedio);
        playMp3.start();

    }

}