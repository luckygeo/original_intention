package me.relations.reflections;

import me.relations.extend.Employee;
import me.relations.extend.Manager;
import org.junit.Test;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import static java.lang.Class.forName;
import static org.junit.Assert.*;

/**
 * Created by tgs on 2017/7/14 21:56.
 *
 * @星期五
 */
public final class UsingClassTest extends Object{

    @Test
    public void printClassBaseInfo() throws Exception {
        Employee manager = new Manager();
        //throws ClassNotFoundException
        Class cL1 = forName(Employee.class.getName());
        //通过反射生成对象
        Employee reflectionEm = null;

        try {
            reflectionEm = (Employee) cL1.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        reflectionEm.getName();
        assertEquals(Employee.class, cL1);// true 比较2个类对象是否相等

        //UsingClass.printClassBaseInfo(manager.getClass());
    }

    @Test
    public void testOther(){
        System.out.println(int.class.getName()); //   int
        System.out.println(int[].class.getName()); // [I
        System.out.println(Modifier.toString(this.getClass().getModifiers()));
    }

    @Test
    public void printClassBaseInfo2(){
        //UsingClass.printClassBaseInfo(Double.class);
        UsingClass.printClassBaseInfo(Manager.class);
    }

    /**
     * 测试通过反射获取对象的属性值
     */
    @Test
    public void testFieldValue(){
        Employee employee = new Employee("高祥", 100);
        Class emClass = employee.getClass();
        try {
            Field field = emClass.getDeclaredField("name");
            //field 为私有属性时，必须设置 accessible 为 true 方可获取属性值
            field.setAccessible(true);
            System.out.println(field.get(employee));
            field.setAccessible(true);
            field.set(employee,"流行");
            System.out.println(field.get(employee));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testArray(){
        String[] names = {"gao", "li", "liu"};
        Class cl = names.getClass();
        Class tt = cl.getComponentType();//获取数组的类型
        System.out.println(tt.getName());
        try {
            Object objects = Array.newInstance(tt, 10);
            String[] strings = (String[]) objects;
            int j = 0;
            for (String string : strings) {
                strings[j] = String.valueOf(Math.random());
                j++;
            }
            System.out.println(strings.length);
            for (String string : strings) {
                System.out.println(string);
            }
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试通Method对象的使用
     */
    @Test
    public void testMethod() throws Exception {
        Employee m = new Employee();
        m.setSalary(90D);
        Method speaksMethod = m.getClass().getMethod("speaks", String.class);
        String s = (String) speaksMethod.invoke(m, "i am invoke speak");//已经调用speaks了，s 为返回null
        System.out.println(s);//null
        Method getSalaryMethod = m.getClass().getMethod("getSalary");
        Double d = (double) getSalaryMethod.invoke(m);
        System.out.println(d);

    }

}