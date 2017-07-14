package me.relations.extend;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tgs on 2017/7/14 17:34.
 *
 * @星期五
 */
public class PersonTest {
    @Test
    public void speak() throws Exception {
        Person[] persons = new Person[2];
        persons[0] = new Student();
        persons[1] = new Employee();
        Person p1 = new Person() {
            @Override
            public void speak() {
                System.out.println("匿名");
            }
        };

        p1.speak();

        Person p2 = new Person() {
            @Override
            public void speak() {
                System.out.println("匿名");
            }
        };
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        for (Person p : persons) {
            p.speak();
        }
        p1.getClass();
    }

}