package me.theads;

/**
 * Created by gao on 2017/7/16 19:46.
 *
 * @星期日
 */
public class Mp3 implements Runnable{
    @Override
    public void run() {
        System.out.println("mp3 run");
        for (int i = 0; i < 1000; i++) {
            System.out.println("mp3 playing!");
        }

    }
}
