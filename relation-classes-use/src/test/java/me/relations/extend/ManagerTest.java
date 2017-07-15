package me.relations.extend;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tgs on 2017/7/7 9:00.
 *
 * @星期五
 */
public class ManagerTest {
    @Test
    public void getSalary() throws Exception {
        Employee employee = new Manager();
        //在执行时如果判断内部执行的方法没有对父类的方法进行覆盖则使用父类的方法，否则使用覆盖后的方法。
        System.out.println(employee.getName());
    }

    @Test
    public void castClass() throws Exception {
        //类的初始化(包括static块的运行和static成员变量的赋值)只运行一次，
        Manager boss = new Manager();
        Manager boss2 = new Manager();
        Employee[] employees = new Employee[3];
        employees[0] = boss;
        employees[1] = new Employee("gao", 90);
        employees[2] = new Employee("li", 60);
        Employee 雇员1 = new Manager();
        System.out.println(雇员1 instanceof Manager);//T
        System.out.println(雇员1 instanceof Employee);//T
        Manager bosss = (Manager) employees[0];
        System.out.println(employees[1] instanceof Manager);//F
        System.out.println(employees[1] instanceof Employee);//T
        Manager bosssw = (Manager) employees[1];//向下转型则报异常  java.lang.ClassCastException
    }

}