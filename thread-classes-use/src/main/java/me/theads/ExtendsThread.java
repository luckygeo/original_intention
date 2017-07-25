package me.theads;

/**
 * Created by gao on 2017/7/17 19:20.
 *
 * @星期一
 */
public class ExtendsThread extends Thread {
    public ExtendsThread() {
        this.printNameAndAlive();
    }
    @Override
    public void run(){
        this.printNameAndAlive();
    }
    private void printNameAndAlive(){
        System.out.println("Thread.currentThread().getName()===="+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()===="+Thread.currentThread().isAlive());
        System.out.println("this.getName()======="+this.getName());
        ExtendsThreadMain.sleep();
        System.out.println("this.isAlive======"+this.isAlive());
        System.out.println("this.currentThread()======"+this.currentThread().isAlive());
    }
}
