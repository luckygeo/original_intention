package me.theads;

/**
 * Created by gao on 2017/7/17 19:24.
 *
 * 注意理解当前线程 Thread.currentThread 和this.thread,以下为程序运行结果
 *
 * Thread.currentThread().getName()====main
 * Thread.currentThread().isAlive()====true
 * this.getName()=======Thread-0
 * this.isAlive======false
 * 12
 * Thread.currentThread().getName()====AAAAAA
 * Thread.currentThread().isAlive()====true
 * this.getName()=======Thread-0
 * this.isAlive======false
 * this.isAlive======true
 *
 * @星期一
 */
public class ExtendsThreadMain {

    /**
     * 让当前正在执行的线程休眠1秒，注意是“正在执行的线程”
     *
     * @see     java.lang.Thread#sleep(long)
     *
     */
    public static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExtendsThread thread = new ExtendsThread();
        Thread thread1 = new Thread(thread);
        thread1.setName("AAAAAA");
        thread1.start();
        sleep();
        System.out.println(thread1.getId());
    }
}
