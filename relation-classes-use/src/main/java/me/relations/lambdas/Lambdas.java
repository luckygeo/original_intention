package me.relations.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

/**
 * Created
 * 使用java8 lambda 表达式
 * @see <a href="http://blog.csdn.net/lsmsrc/article/details/41084443"></a>
 */
public class Lambdas {
    public static void main(String[] args) {

        String[] names = {"li", "haoo", "g", "lanss", "yand", "haoa"};
        System.out.println(Arrays.toString(names));
        //默认排序
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        //通过比较器排序
            //1.传统
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        Arrays.sort(names, comparator);
        System.out.println(Arrays.toString(names));

        String[] otherNames = {"li", "haoo", "g", "lanss", "yand", "haoa"};
            //lambda表达式
        System.out.println(Arrays.toString(otherNames));
        //Arrays.sort(otherNames, (first, second) -> first.length() - second.length());
        Arrays.sort(otherNames, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(otherNames));

        Predicate<Integer> big6 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                return t > 6;
            }
        };
        Predicate<Integer> lamBig6 = t -> {
            System.out.println("you are welcome " + t);
            return t > 6;
        };
        System.out.println(big6.test(7));
        System.out.println(lamBig6.negate().test(7));
        Predicate<Integer> big7 = x -> x > 7;
        System.out.println(big7.negate());
    }
}
