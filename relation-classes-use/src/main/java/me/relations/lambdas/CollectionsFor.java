package me.relations.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by tgs on 2017/7/17 13:16.
 * java8 新技能是Streams
 *
 * @星期一
 */
public class CollectionsFor {

    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("Hello Lambda!");
        String[] strings = new String[]{"gao", "Liu22", "li2222", "zhao222"};
        //遍历
        List<String> s = Arrays.asList(strings);
            //1.迭代器 filter
        Iterator iterator = s.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            if (iterator.next().toString().length() > 5) {
                count++;
            }
        }
            //2.java8 stream lambda filter
        long count2= s.stream().filter(y -> y.length()>5).count();
        s.stream().filter(person -> {
            System.out.println("ff");
            return person.length()>0;
        });
        //你会发现，以上语句其实他什么都没有打印，只需在后面向Stream要结果(比如调用.count()方法)，
        //那么你一定会看到输出了“ff！”。是不是很像延迟加载？
        //他更像是设计模式里面的“生成器模式”不是吗。等等，
        //Stream支持延迟加载可以支持“预先加载”(Eager)吗？
        //，count()方法就是。
        //若Stream的方法返回的是Stream类型，那么就是延迟加载，否则不是
        System.out.println(count2 == count);//true

        ///如现在我们要获取personList
        //里面长度大于的这样一个子集，怎么弄呢？调用collect(toList)方法
        //Stream.map() 一对一的转换
        List<String> ly = s.stream().filter(y -> y.length() > 5).map(String::toUpperCase).collect(Collectors.toList());

        ly.forEach(System.out::println);


        //Stream.flatMap() 合并java


        String[] s__0 = new String[]{"gao", "Liu22", "li2222", "zhao222"};
        //遍历
        List<String> s__ = Arrays.asList(strings);
        String[] names = new String[]{"gao_", "Liu22_", "li2222_", "zhao222_"};
        List<String> s_ = Arrays.asList(names);
        s_ = Stream.of(s__, s_).flatMap(s1 -> s1.stream()).collect(Collectors.toList());
        s_.forEach(System.out::println);
        //Stream.of(s, s_).flatMap(Collection::stream).collect(Collectors.toList());







    }
}
