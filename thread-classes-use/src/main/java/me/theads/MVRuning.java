package me.theads;

/**
 * Created by gao on 2017/7/16 20:00.
 *
 * @星期日
 */
public class MVRuning {
    public static void main(String[] args) {
        Runnable mp3 = new Mp3();
        Runnable vedio = new Vedio();
        Thread playMp3 = new Thread(mp3);
        Thread playVedio = new Thread(vedio);
        playMp3.start();
        playVedio.start();
    }
}
