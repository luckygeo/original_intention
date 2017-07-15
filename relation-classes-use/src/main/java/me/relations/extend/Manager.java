package me.relations.extend;

/**
 * Created
 * 继承类 new 子类对象执行顺序
 *              1.父类静态块
 *              2.子类静态块
 *              3.父类初始块
 *              4.父类构造方法
 *              5.子类初始块
 *              6.子类构造方法
 *
 *
 * 1.执行的大致顺序如下，
 * <p>
 * 　　(1) 在一个不存在继承的类中：初始化static变量,执行static初始化快-->初始化普通成员变量(如果有赋值语句),执行普通初始化块-->构造方法
 * <p>
 * 　　(2)在一个存在继承的类中：初始化父类static成员变量,运行父类static初始化块-->初始化子类static成员变量,运行子类static初始化块-->初始化父类实例成员变量(如果有赋值语句),执行父类普通初始化块-->父类构造方法-->初始化子类实例成员变量(如果有赋值语句)及普通初始化块-->子类构造方法。
 * <p>
 * 　　注意：其中变量初始化(赋值)和初始化块的执行与相关语句在源码中的放置顺序一致，不过变量声明会最先执行，参考http://www.189works.com/article-52232-1.html。
 * <p>
 * 2.static成员变量可以再定义的时候初始化也可以在static块中初始化，static块可以出现多次，当编译成.class文件时会将多个static块的内容合并；实例成员变量可以再定义时初始化也可以在普通初始化块或构造函数中初始化。
 * <p>
 * 　基本数据类型的成员变量要在初始化后再使用，引用数据类型的成员变量在实例化后才能被使用。
 * <p>
 * 3.类的加载时机：
 * <p>
 * (1) 用new创建该类的实例时；
 * <p>
 * (2) 使用java.lang.reflect进行反射调用的时候；
 * <p>
 * (3) 之前没有加载该类，之后加载该类的子类的时候；
 * <p>
 * (4) 当虚拟机启动时，初始化main函数所在的类。
 * <p>
 * 4.JVM载入类时会执行static块，创建一个实例时会运行构造方法。static块和static成员变量都是属于类而非实例的；
 * 构造函数和普通成员变量是属于一个实例的。类的初始化(包括static块的运行和static成员变量的赋值)只运行一次，
 * 多次创建某个类的实例只会运行一次该类的static()块，但会运行多次其构造函数。
 *
 * @see <a href="http://blog.csdn.net/u012914089/article/details/26275635"></a>
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
