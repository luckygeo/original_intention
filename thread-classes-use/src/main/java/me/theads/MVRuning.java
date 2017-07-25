package me.theads;

/**
 * Created by gao on 2017/7/16 20:00.
 *
 * @星期日
 */
public class MVRuning {

    public static void main(String[] args) throws Exception{

        System.out.println(Thread.currentThread().getName());
        Runnable mp3 = new Mp3();
        Runnable vedio = new Vedio();
        Thread playMp3 = new Thread(mp3);
        Thread playVedio = new Thread(vedio);
        playMp3.setName("================");
        playMp3.start();
        playVedio.start();
        Thread.sleep(5000);
        System.out.println("------------------------------"+playMp3.isAlive());

    }
}
