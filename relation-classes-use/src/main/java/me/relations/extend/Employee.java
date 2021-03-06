package me.relations.extend;

/**
 * Created by  on 2017/7/7 7:43.
 *
 * @星期五 父类 ，超类和子类来源于计算机科学和数学理论的集合术语，雇员是经理的超集， is-a 继承关系
 * 用————————|>表示
 */
public class Employee extends Person{

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(){
        System.out.println("父类构造方法");
    }
    {
        System.out.println("父类初始块");
    }
    static {
        System.out.println("父类静态块");
    }

    @Override
    public void speak() {
        System.out.println("i am a emplyee");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    private String name;

    private Double salary;


}
