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
        System.out.println(Thread.currentThread().getName());
        Runnable mp3 = new Mp3();
        Thread playMp3 = new Thread(mp3);
        playMp3.start();
        Thread.sleep(5000);
        playMp3.interrupt();
        System.out.println(playMp3.isInterrupted());
        Thread.sleep(5000);
        //Runnable vedio = new Vedio();
        //Thread playMp3 = new Thread(mp3);
        //Thread playVedio = new Thread(vedio);
        //playMp3.start();

    }

}