package me.relations.extend;

/**
 * Created by tgs on 2017/7/14 17:24.
 *
 * 抽象类的方法和接口一样必须被覆盖
 *
 * @星期五
 */
public abstract class Person {

    public abstract void speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void speaks(String msg) {
        System.out.println(msg);
    }


}
