package me.relations.extend;

/**
 * Created by tgs on 2017/7/7 7:46.
 * 继承类 new 子类对象执行顺序
 * @see <a href="http://blog.csdn.net/u012914089/article/details/26275635"></a>
 * 1.父类静态块
 * 2.子类静态块
 * 3.父类初始块
 * 4.父类构造方法
 * 5.子类初始块
 * 6.子类构造方法
 *
 * @星期五
 */
public class Manager extends Employee {
    public Manager() {
        System.out.println("子类构造方法");
    }
    {
        System.out.println("子类初始块");
    }

    static {
        System.out.println("子类静态块");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    public Double getSalary() {
        Double salary = super.getSalary() + this.bonus;
        return salary;
    }

    public String getName() {

        return "子类名字";
    }


    private double bonus;
    public double bonus2;
}
