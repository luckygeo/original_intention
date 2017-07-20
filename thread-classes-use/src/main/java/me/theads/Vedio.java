package me.theads;

/**
 * Created by gao on 2017/7/16 19:46.
 *
 * @星期日
 */
public class Vedio implements Runnable {
    @Override
    public void run() {
        System.out.println("vedio run");
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("playing vedio!");
        }

    }
}
