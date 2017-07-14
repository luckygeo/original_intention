package me.relations.reflections;

import me.relations.extend.Employee;
import me.relations.extend.Manager;
import org.junit.Test;

import static java.lang.Class.forName;
import static org.junit.Assert.*;

/**
 * Created by tgs on 2017/7/14 21:56.
 *
 * @星期五
 */
public class UsingClassTest {
    @Test
    public void printClassBaseInfo() throws Exception {
        Employee manager = new Manager();
        Class cL1 = forName(Employee.class.getName());
        Employee reflectionEm = (Employee) cL1.newInstance();
        reflectionEm.getName();
        //UsingClass.printClassBaseInfo(manager.getClass());
    }

}